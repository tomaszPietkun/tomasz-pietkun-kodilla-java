package com.kodilla.good.paterns.challanges;

public class ProductOrderServiceRunner {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new ProductOrder(), new ProductOrderRepository());

        productOrderService.process(orderRequest);
    }
}
