package com.kodilla.good.paterns.challanges;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {

    public ProductOrderRepository() {

    }

    @Override
    public boolean createOrder(User user, String item, LocalDateTime date) {
        return false;
    }
}
