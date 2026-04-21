package kanishka.purchase_order.ledger_master.mapper;

import kanishka.purchase_order.ledger_master.dto.ledger_master_request.LedgerSundryBankDetailsRequest;
import kanishka.purchase_order.ledger_master.dto.ledger_master_response.LedgerSundryBankDetailsResponse;
import kanishka.purchase_order.ledger_master.model.LedgerSundryBankDetails;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface LedgerSundryBankDetailsMapper {

    // request -> entity
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "ledgerMaster", ignore = true)
    LedgerSundryBankDetails toEntity(LedgerSundryBankDetailsRequest request);

    // entity -> response
    LedgerSundryBankDetailsResponse toDto(LedgerSundryBankDetails entity);

    // list mappings
    List<LedgerSundryBankDetails> toEntityList(List<LedgerSundryBankDetailsRequest> requestList);
    List<LedgerSundryBankDetailsResponse> toDtoList(List<LedgerSundryBankDetails> entityList);
}
