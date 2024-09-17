package com.devskiller.microstore.warehouse;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import static java.util.Collections.singletonMap;

@Service
@RequiredArgsConstructor
public class WarehouseService {

    private final WarehouseProducer warehouseProducer;

    public void sendPackage(final String orderId) {
        warehouseProducer
                .wareHouseQueue()
                .send(MessageBuilder
                        .createMessage(new WarehouseRequest(orderId, "SEND"),
                                new MessageHeaders(singletonMap("contentType",
                                        MediaType.APPLICATION_JSON_UTF8_VALUE))));
    }


}
