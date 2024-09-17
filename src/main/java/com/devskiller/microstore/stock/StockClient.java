package com.devskiller.microstore.stock;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "stock")
public interface StockClient {

    @GetMapping(value = "/products/{orderId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    StockResponse checkStock(@PathVariable("orderId") final String orderId);
}
