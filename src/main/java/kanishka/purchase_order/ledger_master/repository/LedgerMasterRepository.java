package kanishka.purchase_order.ledger_master.repository;

import kanishka.purchase_order.ledger_master.model.LedgerMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface LedgerMasterRepository extends JpaRepository<LedgerMaster, Long> {
    // find all
    Optional<LedgerMaster> findByLedgerName(String ledgerName);
    // check if ledger name exists
    boolean existsByLedgerName(String ledgerName);

}
