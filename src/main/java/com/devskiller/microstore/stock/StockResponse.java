package com.devskiller.microstore.stock;

import lombok.Data;

import java.io.Serializable;

@Data
public class StockResponse implements Serializable {

    private static final long serialVersionUID = 5410226779505742999L;

    private String orderId;
    private String status;
}
