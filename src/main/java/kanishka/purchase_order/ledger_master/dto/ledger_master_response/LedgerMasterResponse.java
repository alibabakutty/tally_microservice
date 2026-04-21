package kanishka.purchase_order.ledger_master.dto.ledger_master_response;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public record LedgerMasterResponse(
        String ledgerName,
        String underGroup,
        String subUnderGroup,
        String typeOfDutyOrTax,
        String taxType,
        Float percentageOfCalculation,
        String maintainBalancesByBill,
        String provideBankDetails,
        List<LedgerSundryBankDetailsResponse> ledgerSundryBankDetails,
        String contactPerson,
        String contactPhoneNumber,
        BigInteger mobileNumber,
        BigInteger whatsAppNumber,
        String email,
        String mailingName,
        String addressOne,
        String addressTwo,
        String addressThree,
        String addressFour,
        String addressFive,
        String stateName,
        String countryName,
        Integer pincode,
        String panOrItNumber,
        String gstOrUin,
        String tanNumber,
        String msmeNumber,
        String forexApplicable,
        String dateForOpening,
        BigDecimal openingBalance,
        String creditOrDebit,
        BigDecimal totalForexAmount,
        String totalForexAmountCreditOrDebit,
        BigDecimal totalInwardReferenceAmount,
        BigDecimal totalOutwardReferenceAmount,
        String totalReferenceAmountCreditOrDebit,
        List<LedgerForexDetailsResponse> ledgerForexDetails
) {
}
