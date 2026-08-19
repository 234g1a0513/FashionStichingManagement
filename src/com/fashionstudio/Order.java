package com.fashionstudio;

public class Order {

    private int orderId;
    private int customerId;
    private String dressType;
    private String orderDate;
    private String deliveryDate;
    private double price;
    private String status;

    public Order(int orderId, int customerId, String dressType,
                 String orderDate, String deliveryDate,
                 double price, String status) {

        this.orderId = orderId;
        this.customerId = customerId;
        this.dressType = dressType;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.price = price;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getDressType() {
        return dressType;
    }

    public void setDressType(String dressType) {
        this.dressType = dressType;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}