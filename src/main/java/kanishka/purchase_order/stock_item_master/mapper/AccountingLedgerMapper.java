package kanishka.purchase_order.stock_item_master.mapper;

import kanishka.purchase_order.stock_item_master.dto.stock_item_master_request.AccountingLedgerRequest;
import kanishka.purchase_order.stock_item_master.dto.stock_item_master_response.AccountingLedgerResponse;
import kanishka.purchase_order.stock_item_master.model.AccountingLedger;
import kanishka.purchase_order.stock_item_master.model.StockItemMaster;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AccountingLedgerMapper {
    // request -> entity
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "stockItemMaster", ignore = true)
    AccountingLedger toEntity(AccountingLedgerRequest request);

    // entity -> response
    AccountingLedgerResponse toDto(AccountingLedger entity);

    // list mappings
    List<AccountingLedger> toEntityList(List<AccountingLedgerRequest> requestList);
    List<AccountingLedgerResponse> toDtoList(List<AccountingLedger> entityList);
}
