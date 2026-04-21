package kanishka.purchase_order.stock_item_master.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "opening_balance_stock")
public class OpeningBalanceStock {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "opening_balance_stock_seq")
    @SequenceGenerator(name = "opening_balance_stock_seq", sequenceName = "opening_balance_stock_sequence", allocationSize = 50)
    private Long id;

    @Column(name = "godown_name")
    private String location;

    @Column(name = "batch_name")
    private String batch;

    @Column(name = "quantity")
    private BigDecimal quantity;

    @Column(name = "per_unit")
    private String uom;

    @Column(name = "rate_amount")
    private BigDecimal rate;

    @Column(name = "net_amount")
    private BigDecimal amount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stock_item_master_id")
    private StockItemMaster stockItemMaster;
}
