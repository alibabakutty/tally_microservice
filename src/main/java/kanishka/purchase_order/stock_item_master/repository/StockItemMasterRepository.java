package kanishka.purchase_order.stock_item_master.repository;

import kanishka.purchase_order.stock_item_master.model.StockItemMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface StockItemMasterRepository extends JpaRepository<StockItemMaster, Long> {
    // find all
    Optional<StockItemMaster> findByStockItemName(String stockItemName);
    // check if stock item name exists
    boolean existsByStockItemName(String stockItemName);
}
