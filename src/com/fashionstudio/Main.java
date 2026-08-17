package com.fashionstudio;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(
            1,
            "Arshiya",
            "9876543210",
            "arshiya@gmail.com"
        );

        System.out.println("Customer ID: " + customer.getCustomerId());
        System.out.println("Name: " + customer.getName());
        System.out.println("Phone: " + customer.getPhone());
        System.out.println("Email: " + customer.getEmail());
    }
}