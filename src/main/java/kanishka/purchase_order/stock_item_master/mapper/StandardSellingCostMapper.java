package kanishka.purchase_order.stock_item_master.mapper;

import kanishka.purchase_order.stock_item_master.dto.stock_item_master_request.StandardSellingCostRequest;
import kanishka.purchase_order.stock_item_master.dto.stock_item_master_response.StandardSellingCostResponse;
import kanishka.purchase_order.stock_item_master.model.StandardSellingCost;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StandardSellingCostMapper {

    // request -> entity
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "stockItemMaster", ignore = true)
    StandardSellingCost toEntity(StandardSellingCostRequest request);

    // entity -> response
    StandardSellingCostResponse toDto(StandardSellingCost entity);

    // list mappings
    List<StandardSellingCost> toEntityList(List<StandardSellingCostRequest> requestList);
    List<StandardSellingCostResponse> toDtoList(List<StandardSellingCost> entityList);
}
