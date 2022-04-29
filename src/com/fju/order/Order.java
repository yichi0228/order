package com.fju.order;

public class Order {
    int amount;
    Delivery delivery;
    Delivery shipFeed;
    public  int total(){
        return (amount+delivery.shipFeed);
    }
    public Order(int amount, Delivery delivery) {
        this.amount = amount;
        this.delivery = delivery;



    }
}
