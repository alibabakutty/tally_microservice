package kanishka.purchase_order.stock_item_master.mapper;

import kanishka.purchase_order.stock_item_master.dto.stock_item_master_request.StandardSellingPriceRequest;
import kanishka.purchase_order.stock_item_master.dto.stock_item_master_response.StandardSellingPriceResponse;
import kanishka.purchase_order.stock_item_master.model.StandardSellingPrice;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StandardSellingPriceMapper {

    // request ->entity
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "stockItemMaster", ignore = true)
    StandardSellingPrice toEntity(StandardSellingPriceRequest request);

    // entity -> resposne
    StandardSellingPriceResponse toDto(StandardSellingPrice entity);

    // list mappings
    List<StandardSellingPrice> toEntityList(List<StandardSellingPriceRequest> requestList);
    List<StandardSellingPriceResponse> toDtoList(List<StandardSellingPrice> entityList);
}
