package kanishka.purchase_order.purchase_order_voucher.mapper;

import kanishka.purchase_order.purchase_order_voucher.dto.api_side.PurchaseOrderSubFormRequest;
import kanishka.purchase_order.purchase_order_voucher.dto.response_side.PurchaseOrderSubFormResponse;
import kanishka.purchase_order.purchase_order_voucher.model.PurchaseOrderSubFormEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PurchaseOrderSubFormMapper {

    // request -> entity
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "purchaseOrder", ignore = true)  // parent will be set separately
    PurchaseOrderSubFormEntity toEntity(PurchaseOrderSubFormRequest request);

    // entity -> response
    PurchaseOrderSubFormResponse  toDto(PurchaseOrderSubFormEntity entity);

    // list mappings
    List<PurchaseOrderSubFormEntity> toEntityList(List<PurchaseOrderSubFormRequest> requestList);
    List<PurchaseOrderSubFormResponse> toDtoList(List<PurchaseOrderSubFormEntity> entityList);

}
