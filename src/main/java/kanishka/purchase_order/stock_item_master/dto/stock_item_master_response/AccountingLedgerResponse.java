package kanishka.purchase_order.stock_item_master.dto.stock_item_master_response;

public record AccountingLedgerResponse(

        String purchase,
        String sales,
        String creditNote,
        String debitNote
) {
}
