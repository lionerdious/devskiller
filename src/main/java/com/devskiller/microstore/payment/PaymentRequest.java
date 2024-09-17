package com.devskiller.microstore.payment;

import lombok.Data;

import java.io.Serializable;

@Data
public class PaymentRequest implements Serializable {

    private static final long serialVersionUID = 7149011114537574609L;

    private String status;

    boolean isPaid() {
        return "PAID".equals(status);
    }
}
