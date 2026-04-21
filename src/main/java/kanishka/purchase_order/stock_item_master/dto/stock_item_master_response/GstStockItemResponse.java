package kanishka.purchase_order.stock_item_master.dto.stock_item_master_response;

import java.time.LocalDate;

public record GstStockItemResponse(

        LocalDate date,
        Integer hsnCode,
        Float percentage,
        String gstStockItemStatus
) {
}
