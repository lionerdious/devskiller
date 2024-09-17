package com.devskiller.microstore.payment;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PutMapping(value = "/{orderId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity receivePayment(@PathVariable("orderId") final String orderId, @RequestBody final PaymentRequest paymentRequest) {
        paymentService.processOrderOnPayment(orderId, paymentRequest);
        return ResponseEntity.accepted().build();
    }
}
