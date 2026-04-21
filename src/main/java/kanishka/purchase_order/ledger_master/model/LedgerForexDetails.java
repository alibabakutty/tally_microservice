package kanishka.purchase_order.ledger_master.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "ledger_forex_details")
public class LedgerForexDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ledger_forex_details_seq")
    @SequenceGenerator(name = "ledger_sundry_bank_details_seq", sequenceName = "ledger_sundry_bank_details_sequence", allocationSize = 50)
    private Long id;

    @Column(name = "forex_date")
    private LocalDate forexDate;

    @Column(name = "reference_name")
    private String referenceName;

    @Column(name = "due_date")
    private LocalDate dueDate;

    @Column(name = "forex_currency_type")
    private String forexCurrencyType;

    @Column(name = "forex_currency_symbol")
    private String forexCurrencySymbol;

    @Column(name = "forex_amount")
    private BigDecimal forexAmount;

    @Column(name = "forex_credit_or_debit")
    private String forexCreditOrDebit;

    @Column(name = "exchange_rate")
    private BigDecimal exchangeRate;

    @Column(name = "outward_reference_amount")
    private BigDecimal outwardReferenceAmount;

    @Column(name = "inward_reference_amount")
    private BigDecimal inwardReferenceAmount;

    @Column(name = "reference_credit_or_debit")
    private String referenceCreditOrDebit;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ledger_master_id")
    private LedgerMaster ledgerMaster;
}
