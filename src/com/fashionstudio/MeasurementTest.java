package com.fashionstudio;

public class MeasurementTest {

    public static void main(String[] args) {

        Measurement measurement = new Measurement(
                201,
                1,
                15.5,
                36.0,
                30.0,
                22.5,
                40.0
        );

        System.out.println("Measurement ID: " + measurement.getMeasurementId());
        System.out.println("Customer ID: " + measurement.getCustomerId());
        System.out.println("Shoulder: " + measurement.getShoulder() + " inches");
        System.out.println("Chest: " + measurement.getChest() + " inches");
        System.out.println("Waist: " + measurement.getWaist() + " inches");
        System.out.println("Sleeve Length: " + measurement.getSleeveLength() + " inches");
        System.out.println("Dress Length: " + measurement.getDressLength() + " inches");
    }
}