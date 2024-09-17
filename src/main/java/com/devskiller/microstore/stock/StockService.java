package com.devskiller.microstore.stock;

import org.springframework.stereotype.Service;

@Service
public class StockService {

    private final StockClient stockClient;

    public StockService(final StockClient stockClient) {
        this.stockClient = stockClient;
    }

    public boolean checkAvailability(final String orderId) {
        final StockResponse stockResponse = stockClient.checkStock(orderId);
        return "AVAILABLE".equals(stockResponse.getStatus());
    }
}
