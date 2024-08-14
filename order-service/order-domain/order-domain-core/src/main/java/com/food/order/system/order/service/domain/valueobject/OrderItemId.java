package com.food.order.system.order.service.domain.valueobject;

import com.food.order.system.domain.valueobject.BaseId;

public class OrderItemId extends BaseId<Long> {
    public OrderItemId(Long value) {
        super(value);
    }
}
