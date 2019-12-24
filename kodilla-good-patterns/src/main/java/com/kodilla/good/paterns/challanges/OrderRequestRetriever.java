package com.kodilla.good.paterns.challanges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("John", "Welk", "John.Welk.88");
        String item = "PlayStation 4 Console";
        LocalDateTime date = LocalDateTime.of(2019, 10, 10, 15, 27);

        return new OrderRequest(user, item, date);
    }
}
