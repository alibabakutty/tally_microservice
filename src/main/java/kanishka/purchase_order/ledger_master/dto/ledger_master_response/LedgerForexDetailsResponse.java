package kanishka.purchase_order.ledger_master.dto.ledger_master_response;

import java.math.BigDecimal;
import java.time.LocalDate;

public record LedgerForexDetailsResponse(
        LocalDate forexDate,
        String referenceName,
        LocalDate dueDate,
        String forexCurrencyType,
        String forexCurrencySymbol,
        BigDecimal forexAmount,
        String forexCreditOrDebit,
        BigDecimal exchangeRate,
        BigDecimal outwardReferenceAmount,
        BigDecimal inwardReferenceAmount,
        String referenceCreditOrDebit
) {
}
