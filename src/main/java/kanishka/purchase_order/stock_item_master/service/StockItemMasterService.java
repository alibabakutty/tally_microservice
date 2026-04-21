package kanishka.purchase_order.stock_item_master.service;

import kanishka.purchase_order.stock_item_master.dto.stock_item_master_request.StockItemMasterRequest;
import kanishka.purchase_order.stock_item_master.dto.stock_item_master_response.StockItemMasterResponse;

import java.util.List;

public interface StockItemMasterService {
    StockItemMasterResponse createStockItem(StockItemMasterRequest request);

    StockItemMasterResponse getStockById(Long id);

    List<StockItemMasterResponse> getAllStocks();

    StockItemMasterResponse updateLedger(Long id, StockItemMasterRequest request);

    void deleteStockItem(Long id);
}
