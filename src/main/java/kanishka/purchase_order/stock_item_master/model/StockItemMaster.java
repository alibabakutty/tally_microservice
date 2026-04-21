package kanishka.purchase_order.stock_item_master.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "stock_item_master", uniqueConstraints = {
        @UniqueConstraint(columnNames = "stock_item_code")
})
public class StockItemMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stock_item_master_seq")
    @SequenceGenerator(name = "stock_item_master_seq", sequenceName = "stock_item_master_sequence", allocationSize = 50)
    private Long id;

    @Column(name = "stock_item_code")
    private String stockItemCode;

    @Column(name = "stock_item_name")
    private String stockItemName;

    @Column(name = "stock_item_printing_name")
    private String stockItemPrintingName;

    @Column(name = "stock_item_description")
    private String stockItemDescription;

    @Column(name = "stock_category")
    private String category;

    @Column(name = "stock_group")
    private String group;

    @Column(name = "stock_units")
    private String units;

    @Column(name = "standard_selling_price_applicable")
    private String standardSellingPriceApplicable;

    @OneToMany(mappedBy = "stockItemMaster", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<StandardSellingPrice> standardSellingPrices;

    @Column(name = "standard_selling_cost_applicable")
    private String standardSellingCostApplicable;

    @OneToMany(mappedBy = "stockItemMaster", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<StandardSellingCost> standardSellingCosts;

    @Column(name = "stock_item_mrp")
    private BigDecimal stockItemMrp;

    @Column(name = "gst_applicable")
    private String gstApplicable;

    @OneToMany(mappedBy = "stockItemMaster", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<GstStockItem> gstStockItems;

    @Column(name = "vat_applicable")
    private String vatApplicable;

    @OneToMany(mappedBy = "stockItemMaster", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<VatStockItem> vatStockItems;

    @Column(name = "batch_applicable")
    private String batchApplicable;

    @Column(name = "account_ledger_applicable")
    private String accountingLedgerApplicable;

    @OneToOne(mappedBy = "stockItemMaster", cascade = CascadeType.ALL, orphanRemoval = true)
    private AccountingLedger accountingLedger;

    @Column(name = "stock_item_godown")
    private String stockItemGodown;

    @Column(name = "opening_balance_quantity")
    private Float openingBalanceQuantity;

    @OneToMany(mappedBy = "stockItemMaster", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<OpeningBalanceStock> openingBalanceStocks;

    @Column(name = "opening_balance_rate")
    private BigDecimal openingBalanceRate;

    @Column(name = "opening_balance_unit")
    private String openingBalanceUnit;

    @Column(name = "opening_balance_value")
    private BigDecimal openingBalanceValue;

    @Column(name = "total_quantity")
    private Float totalQuantity;

    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    @CreationTimestamp
    private LocalDate createdAt;

    @UpdateTimestamp
    private LocalDate updatedAt;
}
