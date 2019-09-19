package com.domain.payPack;

import com.domain.payPack.driverPayPeriod.product.DriverPaymentProduct;

public interface Payment {

    public void payCode(String payCode);
    public void distance(int distance);
    public void paymentRate(int rate);
    public void numberOfOrder(int number);
    public void paymentType();
    public void buildPayDate(String date);
    public void buildDriverNumber(String driverNumber);
    public DriverPaymentProduct getDriverPaymentProduct();
}
