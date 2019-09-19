package com.domain.payPack.driverPayPeriod.product;

public class DriverPaymentProduct {
    private String payCode;
    private int distance;
    private int paymentRate;
    private int numberOfOrder;
    private String paymentType;
    private String payDate;
    private String driverNumber;
    private double payRate;

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getPaymentRate() {
        return paymentRate;
    }

    public void setPaymentRate(int paymentRate) {
        this.paymentRate = paymentRate;
    }

    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    public void setNumberOfOrder(int numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String buildPayDate) {
        this.payDate = buildPayDate;
    }

    public String getDriverNumber() {
        return driverNumber;
    }

    public void setDriverNumber(String buildDriverNumber) {
        this.driverNumber = buildDriverNumber;
    }

    @Override
    public String toString() {
        return "DriverPaymentProduct{" +
                "payCode='" + payCode + '\'' +
                ", distance=" + distance +
                ", paymentRate=" + paymentRate +
                ", numberOfOrder=" + numberOfOrder +
                ", paymentType='" + paymentType + '\'' +
                ", payDate='" + payDate + '\'' +
                ", driverNumber='" + driverNumber + '\'' +
                ", payRate=" + payRate +
                '}';
    }
}
