package kanishka.purchase_order.stock_item_master.dto.stock_item_master_request;

import java.time.LocalDate;

public record VatStockItemRequest(
        LocalDate date,
        Integer vatCode,
        Float percentage,
        String vatStockItemStatus
) {
}
