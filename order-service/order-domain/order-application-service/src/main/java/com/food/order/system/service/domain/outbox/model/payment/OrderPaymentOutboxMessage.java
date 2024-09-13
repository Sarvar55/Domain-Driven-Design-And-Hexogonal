package com.food.order.system.service.domain.outbox.model.payment;

 
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import java.time.ZonedDateTime;
import java.util.UUID;

import com.food.order.system.outbox.OutboxStatus;
import com.food.order.system.saga.SagaStatus;

@Getter
@Builder
@AllArgsConstructor
public class OrderPaymentOutboxMessage {

    private UUID id;
    private UUID sagaId;
    private ZonedDateTime createdAt;
    private ZonedDateTime processedAt;
    private String type;
    private String payload;
    private OutboxStatus outboxStatus;
    private SagaStatus sagaStatus;
    private String outboxError;
    private int version;


    public void setSagaId(UUID sagaId) {
        this.sagaId = sagaId;
    }
    
    public void setProcessedAt(ZonedDateTime processedAt) {
        this.processedAt = processedAt;
    }
    
    public void setOutboxStatus(OutboxStatus outboxStatus) {
        this.outboxStatus = outboxStatus;
    }
    
    public void setSagaStatus(SagaStatus sagaStatus) {
        this.sagaStatus = sagaStatus;
    }

   
}
