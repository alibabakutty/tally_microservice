package kanishka.purchase_order.stock_item_master.dto.stock_item_master_request;

import kanishka.purchase_order.stock_item_master.model.*;
import java.math.BigDecimal;
import java.util.List;

public record StockItemMasterRequest(

        String stockItemCode,
        String stockItemName,
        String stockItemPrintingName,
        String stockItemDescription,
        String category,
        String group,
        String units,
        String standardSellingPriceApplicable,
        List<StandardSellingPriceRequest> standardSellingPrices,
        String standardSellingCostApplicable,
        List<StandardSellingCostRequest> standardSellingCosts,
        BigDecimal stockItemMrp,
        String gstApplicable,
        List<GstStockItemRequest> gstStockItems,
        String vatApplicable,
        List<VatStockItemRequest> vatStockItems,
        String batchApplicable,
        String accountingLedgerApplicable,
        AccountingLedger accountingLedger,
        String stockItemGodown,
        Float openingBalanceQuantity,
        List<OpeningBalanceStockRequest> openingBalanceStocks,
        BigDecimal openingBalanceRate,
        String openingBalanceUnit,
        BigDecimal openingBalanceValue,
        Float totalQuantity,
        BigDecimal totalAmount
) {
}
