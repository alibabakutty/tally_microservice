package kanishka.purchase_order.stock_item_master.dto.stock_item_master_request;

import jakarta.persistence.Column;

import java.math.BigDecimal;
import java.time.LocalDate;

public record StandardSellingPriceRequest(
        LocalDate date,
        BigDecimal rate,
        Float percentage,
        BigDecimal netRate,
        String sellingPriceStatus
) {
}
