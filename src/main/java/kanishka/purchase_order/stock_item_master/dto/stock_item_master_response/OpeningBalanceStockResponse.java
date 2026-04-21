package kanishka.purchase_order.stock_item_master.dto.stock_item_master_response;

import java.math.BigDecimal;

public record OpeningBalanceStockResponse(

        String location,
        String batch,
        BigDecimal quantity,
        String uom,
        BigDecimal rate,
        BigDecimal amount
) {
}
