package com.fashionstudio;

public class OrderTest {

    public static void main(String[] args) {

        Order order = new Order(
                101,
                1,
                "Lehenga",
                "19-08-2026",
                "25-08-2026",
                5000.00,
                "Pending"
        );

        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Customer ID: " + order.getCustomerId());
        System.out.println("Dress Type: " + order.getDressType());
        System.out.println("Order Date: " + order.getOrderDate());
        System.out.println("Delivery Date: " + order.getDeliveryDate());
        System.out.println("Price: ₹" + order.getPrice());
        System.out.println("Status: " + order.getStatus());
    }
}