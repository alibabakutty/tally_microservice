package kanishka.purchase_order.stock_item_master.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "accounting_ledger")
public class AccountingLedger {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accounting_ledger_seq")
    @SequenceGenerator(name = "accounting_ledger_seq", sequenceName = "accounting_ledger_sequence", allocationSize = 50)
    private Long id;

    @Column(name = "accounting_ledger_purchase")
    private String purchase;

    @Column(name = "accounting_ledger_sales")
    private String sales;

    @Column(name = "accounting_ledger_credit_note")
    private String creditNote;

    @Column(name = "accounting_ledger_debit_note")
    private String debitNote;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stock_item_master_id")
    private StockItemMaster stockItemMaster;
}
