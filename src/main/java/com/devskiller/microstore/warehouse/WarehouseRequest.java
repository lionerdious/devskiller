package com.devskiller.microstore.warehouse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WarehouseRequest implements Serializable {

    private static final long serialVersionUID = 2604497769991027225L;

    private String orderId;
    private String action;
}
