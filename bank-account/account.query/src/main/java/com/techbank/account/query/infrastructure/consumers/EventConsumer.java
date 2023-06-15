package com.techbank.account.query.infrastructure.consumers;

import org.springframework.messaging.handler.annotation.Payload;

public interface EventConsumer {
    void consume(@Payload)
}
