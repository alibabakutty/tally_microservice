package kanishka.purchase_order.ledger_master.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "ledger_master", uniqueConstraints = {
        @UniqueConstraint(columnNames = "ledger_name")
})
public class LedgerMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ledger_seq")
    @SequenceGenerator(name = "ledger_seq", sequenceName = "ledger_sequence", allocationSize = 50)
    private Long id;

    @Column(name = "ledger_name", unique = true, nullable = false)
    private String ledgerName;

    @Column(name = "under_group")
    private String underGroup;

    @Column(name = "sub_under_group")
    private String subUnderGroup;

    @Column(name = "type_of_duty_or_tax")
    private String typeOfDutyOrTax;

    @Column(name = "tax_type")
    private String taxType;

    @Column(name = "percentage_of_calculation")
    private Float percentageOfCalculation;

    @Column(name = "maintain_balance_by_bill")
    private String maintainBalancesByBill;

    @Column(name = "provide_bank_details")
    private String provideBankDetails;

    @OneToMany(mappedBy = "ledgerMaster", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<LedgerSundryBankDetails> ledgerSundryBankDetails;

    @Column(name = "contact_person")
    private String contactPerson;

    @Column(name = "contact_phone_number")
    private String contactPhoneNumber;

    @Column(name = "mobile_number")
    private BigInteger mobileNumber;

    @Column(name = "whatsapp_number")
    private BigInteger whatsAppNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "mailing_name")
    private String mailingName;

    @Column(name = "address_one")
    private String addressOne;

    @Column(name = "address_two")
    private String addressTwo;

    @Column(name = "address_three")
    private String addressThree;

    @Column(name = "address_four")
    private String addressFour;

    @Column(name = "address_five")
    private String addressFive;

    @Column(name = "state_name")
    private String stateName;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "pincode")
    private Integer pincode;

    @Column(name = "pan_or_it_number")
    private String panOrItNumber;

    @Column(name = "gst_or_uin")
    private String gstOrUin;

    @Column(name = "tan_number")
    private String tanNumber;

    @Column(name = "msme_number")
    private String msmeNumber;

    @Column(name = "forex_applicable")
    private String forexApplicable;

    @Column(name = "date_for_opening")
    private String dateForOpening;

    @Column(name = "opening_balance")
    private BigDecimal openingBalance;

    @Column(name = "credit_or_debit")
    private String creditOrDebit;

    @Column(name = "total_forex_amount")
    private BigDecimal totalForexAmount;

    @Column(name = "total_forex_amount_credit_or_debit")
    private String totalForexAmountCreditOrDebit;

    @Column(name = "total_inward_reference_amount")
    private BigDecimal totalInwardReferenceAmount;

    @Column(name = "total_outward_reference_amount")
    private BigDecimal totalOutwardReferenceAmount;

    @Column(name = "total_reference_amount_credit_or_debit")
    private String totalReferenceAmountCreditOrDebit;

    @OneToMany(mappedBy = "ledgerMaster", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<LedgerForexDetails> ledgerForexDetails;

    @CreationTimestamp
    private LocalDate createdAt;

    @UpdateTimestamp
    private LocalDate updatedAt;
}
