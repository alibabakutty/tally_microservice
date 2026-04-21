package kanishka.purchase_order.ledger_master.service.service_impl;

import jakarta.persistence.EntityNotFoundException;
import kanishka.purchase_order.ledger_master.dto.ledger_master_request.LedgerMasterRequest;
import kanishka.purchase_order.ledger_master.dto.ledger_master_response.LedgerMasterResponse;
import kanishka.purchase_order.ledger_master.mapper.LedgerMasterMapper;
import kanishka.purchase_order.ledger_master.model.LedgerMaster;
import kanishka.purchase_order.ledger_master.repository.LedgerMasterRepository;
import kanishka.purchase_order.ledger_master.service.LedgerMasterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LedgerMasterServiceImpl implements LedgerMasterService {

    private final LedgerMasterRepository repository;
    private final LedgerMasterMapper mapper;

    @Override
    public LedgerMasterResponse createLedger(LedgerMasterRequest request){
        // business validation: check for duplicates
        if (repository.existsByLedgerName(request.ledgerName())) {
            throw new RuntimeException("Ledger with name '" + request.ledgerName() + "' already exists. ");
        }
        // map request to entity
        LedgerMaster entity = mapper.toEntity(request);
        // save entity
        LedgerMaster savedEntity = repository.save(entity);
        // return response dto
        return mapper.toResponse(savedEntity);
    }

    @Override
    public LedgerMasterResponse getLedgerById(Long id){
        return repository.findById(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new EntityNotFoundException("Ledger not found with ID: " + id));
    }


    @Override
    public List<LedgerMasterResponse> getAllLedgers(){
        return repository.findAll().stream()
                .map(mapper::toResponse)
                .collect(Collectors.toList());
    }


    @Override
    public LedgerMasterResponse updateLedger(Long id, LedgerMasterRequest request){
        // find existing record
        LedgerMaster existingLedger = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Ledger not found with ID: " + id));

        // update the existing entity with new request data
        mapper.updateEntityFromRequest(request, existingLedger);
        // save and return
        LedgerMaster updatedEntity = repository.save(existingLedger);
        return mapper.toResponse(updatedEntity);
    }

    @Override
    public void deleteLedger(Long id){
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Cannot delete. Ledger not found with ID: " + id);
        }
        repository.deleteById(id);
    }
}
