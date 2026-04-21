package kanishka.purchase_order.purchase_order_voucher.service;

import kanishka.purchase_order.purchase_order_voucher.dto.api_side.PurchaseOrderRequest;
import kanishka.purchase_order.purchase_order_voucher.dto.response_side.PurchaseOrderResponse;

import java.util.List;

public interface PurchaseOrderService {
    PurchaseOrderResponse create(PurchaseOrderRequest request);

    PurchaseOrderResponse getById(Long id);

    List<PurchaseOrderResponse> getAll();

    PurchaseOrderResponse update(Long id, PurchaseOrderRequest request);

    void delete(Long id);
}
