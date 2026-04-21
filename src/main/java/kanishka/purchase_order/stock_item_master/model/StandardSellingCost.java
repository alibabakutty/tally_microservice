package kanishka.purchase_order.stock_item_master.model;

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
@Table(name = "standard_selling_cost")
public class StandardSellingCost {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "standard_selling_cost_seq")
    @SequenceGenerator(name = "standard_selling_cost_seq", sequenceName = "standard_selling_cost_sequence", allocationSize = 50)
    private Long id;

    @Column(name = "selling_cost_date")
    private LocalDate date;

    @Column(name = "selling_cost_rate")
    private BigDecimal rate;

    @Column(name = "selling_cost_percentage")
    private Float percentage;

    @Column(name = "selling_cost_net_rate")
    private BigDecimal netRate;

    @Column(name = "selling_cost_status")
    private String sellingCostStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stock_item_master_id")
    private StockItemMaster stockItemMaster;
}
