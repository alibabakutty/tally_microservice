package kanishka.purchase_order.ledger_master.dto.ledger_master_response;

import java.math.BigInteger;

public record LedgerSundryBankDetailsResponse(
        String accountName,
        BigInteger accountNumber,
        String bankName,
        String branchName,
        String ifscCode,
        String accountType,
        String swiftCode,
        String accountStatus
) {
}
