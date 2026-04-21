package kanishka.purchase_order.ledger_master.controller;

import kanishka.purchase_order.ledger_master.dto.ledger_master_request.LedgerMasterRequest;
import kanishka.purchase_order.ledger_master.dto.ledger_master_response.LedgerMasterResponse;
import kanishka.purchase_order.ledger_master.service.LedgerMasterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/v1/ledgers")
@RequiredArgsConstructor
public class LedgerMasterController {

    private final LedgerMasterService service;

    @PostMapping
    public ResponseEntity<LedgerMasterResponse> createLedger(@RequestBody LedgerMasterRequest request) {
        return ResponseEntity.status(201).body(service.createLedger(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<LedgerMasterResponse> getById(@PathVariable Long id){
        return ResponseEntity.ok(service.getLedgerById(id));
    }

    @GetMapping
    public ResponseEntity<List<LedgerMasterResponse>> getAll(){
        return ResponseEntity.ok(service.getAllLedgers());
    }

    @PutMapping("/{id}")
    public ResponseEntity<LedgerMasterResponse> update(@PathVariable Long id, @RequestBody LedgerMasterRequest request){
        return ResponseEntity.ok(service.updateLedger(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.deleteLedger(id);
        return ResponseEntity.noContent().build();
    }
}
