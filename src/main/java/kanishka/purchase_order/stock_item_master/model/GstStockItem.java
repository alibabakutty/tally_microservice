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
@Table(name = "gst_stock_item")
public class GstStockItem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gst_stock_item_seq")
    @SequenceGenerator(name = "gst_stock_item_seq", sequenceName = "gst_stock_item_sequence", allocationSize = 50)
    private Long id;

    @Column(name = "gst_date")
    private LocalDate date;

    @Column(name = "hsn_code")
    private Integer hsnCode;

    @Column(name = "gst_percentage")
    private Float percentage;

    @Column(name = "gst_status")
    private String gstStockItemStatus;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stock_item_master_id")
    private StockItemMaster stockItemMaster;
}
