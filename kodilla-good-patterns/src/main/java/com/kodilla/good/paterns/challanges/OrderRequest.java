package com.kodilla.good.paterns.challanges;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private String item;
    private LocalDateTime date;

    public OrderRequest(User user, String item, LocalDateTime date) {
        this.user = user;
        this.item = item;
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public String getItem() {
        return item;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
