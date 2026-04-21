package kanishka.purchase_order.ledger_master.mapper;

import kanishka.purchase_order.ledger_master.dto.ledger_master_request.LedgerForexDetailsRequest;
import kanishka.purchase_order.ledger_master.dto.ledger_master_response.LedgerForexDetailsResponse;
import kanishka.purchase_order.ledger_master.model.LedgerForexDetails;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface LedgerForexDetailsMapper {

    // request -> entity
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "ledgerMaster", ignore = true)
    LedgerForexDetails toEntity(LedgerForexDetailsRequest request);

    // entity ->response
    LedgerForexDetailsResponse toDto(LedgerForexDetails entity);

    // list mappings
    List<LedgerForexDetails> toEntityList(List<LedgerForexDetailsRequest> requestList);
    List<LedgerForexDetailsResponse> toDtoList(List<LedgerForexDetails> entityList);
}
