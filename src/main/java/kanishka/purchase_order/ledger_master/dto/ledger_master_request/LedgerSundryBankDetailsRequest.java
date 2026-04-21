package kanishka.purchase_order.ledger_master.dto.ledger_master_request;

import jakarta.persistence.Column;

import java.math.BigInteger;

public record LedgerSundryBankDetailsRequest(
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
