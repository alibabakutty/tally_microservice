package kanishka.purchase_order.stock_item_master.mapper;

import kanishka.purchase_order.stock_item_master.dto.stock_item_master_request.StockItemMasterRequest;
import kanishka.purchase_order.stock_item_master.dto.stock_item_master_response.StockItemMasterResponse;
import kanishka.purchase_order.stock_item_master.model.StockItemMaster;
import org.mapstruct.*;
import java.util.Optional;

@Mapper(componentModel = "spring", uses = {
        AccountingLedgerMapper.class, GstStockItemMapper.class, OpeningBalanceStockMapper.class, StandardSellingCostMapper.class, StandardSellingPriceMapper.class, VatStockItemMapper.class
}, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface StockItemMasterMapper {

    // request to entity (post)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    StockItemMaster toEntity(StockItemMasterRequest request);

    // entity to response (get)
    StockItemMasterResponse toResponse(StockItemMaster entity);

    // update existing(put/patch)
    @Mapping(target = "id", ignore = true)
    void updateEntityFromRequest(StockItemMasterRequest request, @MappingTarget StockItemMaster entity);

    @AfterMapping
    default void linkChildren(@MappingTarget StockItemMaster entity) {
        // essential for JPA @OneToMany(mappedBy="stockItemMaster")
        Optional.ofNullable(entity.getAccountingLedger())
                .ifPresent(child -> child.setStockItemMaster(entity));

        Optional.ofNullable(entity.getGstStockItems())
                .ifPresent(list -> list.forEach(child -> child.setStockItemMaster(entity)));

        Optional.ofNullable(entity.getOpeningBalanceStocks())
                .ifPresent(list -> list.forEach(child -> child.setStockItemMaster(entity)));


        Optional.ofNullable(entity.getStandardSellingCosts())
                .ifPresent(list -> list.forEach(child -> child.setStockItemMaster(entity)));


        Optional.ofNullable(entity.getStandardSellingPrices())
                .ifPresent(list -> list.forEach(child -> child.setStockItemMaster(entity)));


        Optional.ofNullable(entity.getVatStockItems())
                .ifPresent(list -> list.forEach(child -> child.setStockItemMaster(entity)));

    }
}
