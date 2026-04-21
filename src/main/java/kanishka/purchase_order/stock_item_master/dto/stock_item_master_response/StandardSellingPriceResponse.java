package kanishka.purchase_order.stock_item_master.dto.stock_item_master_response;

import java.math.BigDecimal;
import java.time.LocalDate;

public record StandardSellingPriceResponse(

        LocalDate date,
        BigDecimal rate,
        Float percentage,
        BigDecimal netRate,
        String sellingPriceStatus
) {
}
