package kanishka.purchase_order.stock_item_master.service.service_impl;

import jakarta.persistence.EntityNotFoundException;
import kanishka.purchase_order.stock_item_master.dto.stock_item_master_request.StockItemMasterRequest;
import kanishka.purchase_order.stock_item_master.dto.stock_item_master_response.StockItemMasterResponse;
import kanishka.purchase_order.stock_item_master.mapper.StockItemMasterMapper;
import kanishka.purchase_order.stock_item_master.model.StockItemMaster;
import kanishka.purchase_order.stock_item_master.repository.StockItemMasterRepository;
import kanishka.purchase_order.stock_item_master.service.StockItemMasterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StockItemMasterServiceImpl implements StockItemMasterService {

    private final StockItemMasterRepository repository;
    private final StockItemMasterMapper mapper;

    @Override
    public StockItemMasterResponse createStockItem(StockItemMasterRequest request) {
        // business validation: check for duplicates
        if (repository.existsByStockItemName(request.stockItemName())) {
            throw new RuntimeException("Stock with name '" + request.stockItemName() + "' already exists. ");
        }
        // map request to entity
        StockItemMaster entity = mapper.toEntity(request);
        // save entity
        StockItemMaster savedEntity = repository.save(entity);
        // return to response
        return mapper.toResponse(savedEntity);
    }

    @Override
    public StockItemMasterResponse getStockById(Long id){
        return repository.findById(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new EntityNotFoundException("Stock not found with ID: " + id));
    }

    @Override
    public List<StockItemMasterResponse> getAllStocks(){
        return repository.findAll().stream()
                .map(mapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public StockItemMasterResponse updateLedger(Long id, StockItemMasterRequest request){
        // find existing record
        StockItemMaster existingStock = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Stock not found with ID: " + id));
        // update the existing entity with new request data
        mapper.updateEntityFromRequest(request, existingStock);
        // save and return
        StockItemMaster updatedStock = repository.save(existingStock);
        return mapper.toResponse(updatedStock);
    }

    @Override
    public void deleteStockItem(Long id){
        if (repository.existsById(id)) {
            throw new EntityNotFoundException("Cannot delete. Stock not found with ID: " + id);
        }
        repository.deleteById(id);
    }
}
