package kanishka.purchase_order.stock_item_master.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "vat_stock_item")
public class VatStockItem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vat_stock_item_seq")
    @SequenceGenerator(name = "vat_stock_item_seq", sequenceName = "vat_stock_item_sequence", allocationSize = 50)
    private Long id;

    @Column(name = "vat_date")
    private LocalDate date;

    @Column(name = "vat_code")
    private Integer vatCode;

    @Column(name = "vat_percentage")
    private Float percentage;

    @Column(name = "vat_status")
    private String vatStockItemStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stock_item_master_id")
    private StockItemMaster stockItemMaster;
}
