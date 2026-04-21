package kanishka.purchase_order.ledger_master.service;

import kanishka.purchase_order.ledger_master.dto.ledger_master_request.LedgerMasterRequest;
import kanishka.purchase_order.ledger_master.dto.ledger_master_response.LedgerMasterResponse;

import java.util.List;

public interface LedgerMasterService {
    LedgerMasterResponse createLedger(LedgerMasterRequest request);

    LedgerMasterResponse getLedgerById(Long id);

    List<LedgerMasterResponse> getAllLedgers();

    LedgerMasterResponse updateLedger(Long id, LedgerMasterRequest request);

    void deleteLedger(Long id);
}
