package kanishka.purchase_order.ledger_master.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ledger_sundry_bank_details")
public class LedgerSundryBankDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ledger_sundry_bank_details_seq")
    @SequenceGenerator(name = "ledger_sundry_bank_details_seq", sequenceName = "ledger_sundry_bank_details_sequence", allocationSize = 50)
    private Long id;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "account_number")
    private BigInteger accountNumber;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "branch_name")
    private String branchName;

    @Column(name = "ifsc_code")
    private String ifscCode;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "swift_code")
    private String swiftCode;

    @Column(name = "account_status")
    private String accountStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ledger_master_id")
    private LedgerMaster ledgerMaster;
}
