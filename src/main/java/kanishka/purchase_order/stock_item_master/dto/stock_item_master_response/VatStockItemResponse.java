package kanishka.purchase_order.stock_item_master.dto.stock_item_master_response;

import java.time.LocalDate;

public record VatStockItemResponse(

        LocalDate date,
        Integer vatCode,
        Float percentage,
        String vatStockItemStatus
) {
}
