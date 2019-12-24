package com.kodilla.good.paterns.challanges;

import java.time.LocalDateTime;

public interface OrderRepository {

    public boolean createOrder(User user, String item, LocalDateTime date);
}
