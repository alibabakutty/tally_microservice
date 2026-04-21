package kanishka.purchase_order.ledger_master.mapper;

import kanishka.purchase_order.ledger_master.dto.ledger_master_request.LedgerMasterRequest;
import kanishka.purchase_order.ledger_master.dto.ledger_master_response.LedgerMasterResponse;
import kanishka.purchase_order.ledger_master.model.LedgerMaster;
import org.mapstruct.*;

import java.util.Optional;

@Mapper(
        componentModel = "spring",
        uses = {LedgerForexDetailsMapper.class, LedgerSundryBankDetailsMapper.class},
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface LedgerMasterMapper {

    // Request to Entity (POST)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true) // Common in microservices
    LedgerMaster toEntity(LedgerMasterRequest request);

    // Entity to Response (GET)
    LedgerMasterResponse toResponse(LedgerMaster entity);

    // Update existing (PUT/PATCH)
    @Mapping(target = "id", ignore = true)
    void updateEntityFromRequest(LedgerMasterRequest request, @MappingTarget LedgerMaster entity);

    @AfterMapping
    default void linkChildren(@MappingTarget LedgerMaster entity) {
        // Essential for JPA @OneToMany(mappedBy = "ledgerMaster")
        Optional.ofNullable(entity.getLedgerSundryBankDetails())
                .ifPresent(list -> list.forEach(child -> child.setLedgerMaster(entity)));

        Optional.ofNullable(entity.getLedgerForexDetails())
                .ifPresent(list -> list.forEach(child -> child.setLedgerMaster(entity)));
    }
}
