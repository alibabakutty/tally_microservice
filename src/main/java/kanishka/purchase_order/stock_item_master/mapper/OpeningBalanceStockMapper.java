package kanishka.purchase_order.stock_item_master.mapper;

import kanishka.purchase_order.stock_item_master.dto.stock_item_master_request.OpeningBalanceStockRequest;
import kanishka.purchase_order.stock_item_master.dto.stock_item_master_response.OpeningBalanceStockResponse;
import kanishka.purchase_order.stock_item_master.model.OpeningBalanceStock;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OpeningBalanceStockMapper {

    // request -> entity
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "stockItemMaster", ignore = true)
    OpeningBalanceStock toEntity(OpeningBalanceStockRequest request);

    // entity -> response
    OpeningBalanceStockResponse toDto(OpeningBalanceStock entity);

    // list mappings
    List<OpeningBalanceStock> toEntityList(List<OpeningBalanceStockRequest> requestList);
    List<OpeningBalanceStockResponse> toDtoList(List<OpeningBalanceStock> entityList);
}
