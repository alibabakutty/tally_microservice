package kanishka.purchase_order.stock_item_master.dto.stock_item_master_response;

import kanishka.purchase_order.stock_item_master.model.*;
import java.math.BigDecimal;
import java.util.List;

public record StockItemMasterResponse(

        String stockItemCode,
        String stockItemName,
        String stockItemPrintingName,
        String stockItemDescription,
        String category,
        String group,
        String units,
        String standardSellingPriceApplicable,
        List<StandardSellingPriceResponse> standardSellingPrices,
        String standardSellingCostApplicable,
        List<StandardSellingCostResponse> standardSellingCosts,
        BigDecimal stockItemMrp,
        String gstApplicable,
        List<GstStockItemResponse> gstStockItems,
        String vatApplicable,
        List<VatStockItemResponse> vatStockItems,
        String batchApplicable,
        String accountingLedgerApplicable,
        AccountingLedger accountingLedger,
        String stockItemGodown,
        Float openingBalanceQuantity,
        List<OpeningBalanceStockResponse> openingBalanceStocks,
        BigDecimal openingBalanceRate,
        String openingBalanceUnit,
        BigDecimal openingBalanceValue,
        Float totalQuantity,
        BigDecimal totalAmount
) {
}
