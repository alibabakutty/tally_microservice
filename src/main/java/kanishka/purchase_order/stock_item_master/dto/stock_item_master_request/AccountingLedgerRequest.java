package kanishka.purchase_order.stock_item_master.dto.stock_item_master_request;

public record AccountingLedgerRequest(

        String purchase,
        String sales,
        String creditNote,
        String debitNote
) {
}
