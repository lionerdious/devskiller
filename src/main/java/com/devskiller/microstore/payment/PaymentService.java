package com.devskiller.microstore.payment;

import com.devskiller.microstore.stock.StockService;
import com.devskiller.microstore.warehouse.WarehouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final StockService stockService;
    private final WarehouseService warehouseService;


    void processOrderOnPayment(final String orderId, final PaymentRequest paymentRequest) {
        if (paymentRequest.isPaid() && stockService.checkAvailability(orderId)) {
            warehouseService.sendPackage(orderId);
        }
    }
}
