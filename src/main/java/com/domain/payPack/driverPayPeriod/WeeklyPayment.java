package com.domain.payPack.driverPayPeriod;


import com.domain.payPack.Payment;
import com.domain.payPack.driverPayPeriod.product.DriverPaymentProduct;

public class WeeklyPayment implements Payment {
    DriverPaymentProduct driverPaymentProduct;

    public WeeklyPayment() {
        driverPaymentProduct =new DriverPaymentProduct();
    }


    @Override
    public void payCode(String payCode) {
        driverPaymentProduct.setPayCode(payCode);
    }

    @Override
    public void distance(int distance) {
        driverPaymentProduct.setDistance(distance);
    }

    @Override
    public void paymentRate(int rate) {

        driverPaymentProduct.setPayRate(rate);
    }

    @Override
    public void numberOfOrder(int number) {
        driverPaymentProduct.setNumberOfOrder(number);
    }

    @Override
    public void paymentType() {
        driverPaymentProduct.setPaymentType("weekly");
    }

    @Override
    public void buildPayDate(String date) {
        driverPaymentProduct.setPayDate(date);
    }

    @Override
    public void buildDriverNumber(String driverNumber) {
        driverPaymentProduct.setDriverNumber(driverNumber);
    }

    @Override
    public DriverPaymentProduct getDriverPaymentProduct() {
        return driverPaymentProduct;
    }
}
