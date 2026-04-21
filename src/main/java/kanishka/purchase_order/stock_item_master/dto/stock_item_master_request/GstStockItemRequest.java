package kanishka.purchase_order.stock_item_master.dto.stock_item_master_request;

import jakarta.persistence.Column;

import java.time.LocalDate;

public record GstStockItemRequest(

        LocalDate date,
        Integer hsnCode,
        Float percentage,
        String gstStockItemStatus
) {
}
