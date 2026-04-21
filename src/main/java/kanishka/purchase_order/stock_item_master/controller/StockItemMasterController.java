package kanishka.purchase_order.stock_item_master.controller;

import kanishka.purchase_order.stock_item_master.dto.stock_item_master_request.StockItemMasterRequest;
import kanishka.purchase_order.stock_item_master.dto.stock_item_master_response.StockItemMasterResponse;
import kanishka.purchase_order.stock_item_master.service.StockItemMasterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/stock-items")
@RequiredArgsConstructor
public class StockItemMasterController {

    private final StockItemMasterService service;

    @PostMapping
    public ResponseEntity<StockItemMasterResponse> createStock(@RequestBody StockItemMasterRequest request){
        return ResponseEntity.status(201).body(service.createStockItem(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<StockItemMasterResponse> getById(@PathVariable Long id){
        return ResponseEntity.ok(service.getStockById(id));
    }

    @GetMapping
    public ResponseEntity<List<StockItemMasterResponse>> getAll(){
        return ResponseEntity.ok(service.getAllStocks());
    }

    @PutMapping("/{id}")
    public ResponseEntity<StockItemMasterResponse> update(@PathVariable Long id, @RequestBody StockItemMasterRequest request){
        return ResponseEntity.ok(service.updateLedger(id, request));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.deleteStockItem(id);
        return ResponseEntity.noContent().build();
    }
}
