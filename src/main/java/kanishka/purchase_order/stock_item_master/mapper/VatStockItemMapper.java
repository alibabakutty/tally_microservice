package kanishka.purchase_order.stock_item_master.mapper;

import kanishka.purchase_order.stock_item_master.dto.stock_item_master_request.VatStockItemRequest;
import kanishka.purchase_order.stock_item_master.dto.stock_item_master_response.VatStockItemResponse;
import kanishka.purchase_order.stock_item_master.model.VatStockItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VatStockItemMapper {

    // request -> entity
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "stockItemMaster", ignore = true)
    VatStockItem toEntity(VatStockItemRequest request);

    // entity -> response
    VatStockItemResponse toDto(VatStockItem entity);

    // list mappings
    List<VatStockItem> toEntityList(List<VatStockItemRequest> requestList);
    List<VatStockItemResponse> toDtoList(List<VatStockItem> entityList);
}
