package kanishka.purchase_order.stock_item_master.dto.stock_item_master_request;

import jakarta.persistence.Column;

import java.math.BigDecimal;

public record OpeningBalanceStockRequest(

        String location,
        String batch,
        BigDecimal quantity,
        String uom,
        BigDecimal rate,
        BigDecimal amount
) {
}
