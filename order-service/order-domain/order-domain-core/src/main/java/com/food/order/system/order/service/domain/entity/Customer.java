package com.food.order.system.order.service.domain.entity;

import com.food.order.system.domain.entity.AggregateRoot;
import com.food.order.system.domain.valueobject.CustomerId;

public class Customer extends AggregateRoot<CustomerId> {

    public Customer() {

    }

    public Customer(CustomerId customerId) {
        super.setId(customerId);
    }
}
