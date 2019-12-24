package com.kodilla.good.paterns.challanges;

import java.time.LocalDateTime;

public interface OrderService {

    public boolean order(User user, String item, LocalDateTime date);
}
