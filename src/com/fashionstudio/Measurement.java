package com.fashionstudio;

public class Measurement {

    private int measurementId;
    private int customerId;
    private double shoulder;
    private double chest;
    private double waist;
    private double sleeveLength;
    private double dressLength;

    public Measurement(int measurementId, int customerId,
                       double shoulder, double chest, double waist,
                       double sleeveLength, double dressLength) {

        this.measurementId = measurementId;
        this.customerId = customerId;
        this.shoulder = shoulder;
        this.chest = chest;
        this.waist = waist;
        this.sleeveLength = sleeveLength;
        this.dressLength = dressLength;
    }

    public int getMeasurementId() {
        return measurementId;
    }

    public void setMeasurementId(int measurementId) {
        this.measurementId = measurementId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getShoulder() {
        return shoulder;
    }

    public void setShoulder(double shoulder) {
        this.shoulder = shoulder;
    }

    public double getChest() {
        return chest;
    }

    public void setChest(double chest) {
        this.chest = chest;
    }

    public double getWaist() {
        return waist;
    }

    public void setWaist(double waist) {
        this.waist = waist;
    }

    public double getSleeveLength() {
        return sleeveLength;
    }

    public void setSleeveLength(double sleeveLength) {
        this.sleeveLength = sleeveLength;
    }

    public double getDressLength() {
        return dressLength;
    }

    public void setDressLength(double dressLength) {
        this.dressLength = dressLength;
    }
}