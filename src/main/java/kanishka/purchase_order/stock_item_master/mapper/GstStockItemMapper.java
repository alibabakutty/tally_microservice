package kanishka.purchase_order.stock_item_master.mapper;

import kanishka.purchase_order.stock_item_master.dto.stock_item_master_request.GstStockItemRequest;
import kanishka.purchase_order.stock_item_master.dto.stock_item_master_response.GstStockItemResponse;
import kanishka.purchase_order.stock_item_master.model.GstStockItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GstStockItemMapper {

    // request -> entity
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "stockItemMaster", ignore = true)
    GstStockItem toEntity(GstStockItemRequest request);

    // entity -> response
    GstStockItemResponse toDto(GstStockItem entity);

    // list mappings
    List<GstStockItem> toEntityList(List<GstStockItemRequest> requestList);
    List<GstStockItemResponse> toDtoList(List<GstStockItem> entityList);
}
