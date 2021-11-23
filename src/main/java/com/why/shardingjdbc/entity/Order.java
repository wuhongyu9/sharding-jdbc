package com.why.shardingjdbc.entity;

import java.math.BigDecimal;

public class Order {
    private long orderId;
    private BigDecimal price;
    private long userId;
    private String status;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", price=" + price +
                ", userId=" + userId +
                ", status='" + status + '\'' +
                '}';
    }

    public Order(long orderId, BigDecimal price, long userId, String status) {
        this.orderId = orderId;
        this.price = price;
        this.userId = userId;
        this.status = status;
    }

    public Order(){}
}
