package com.domain.customerPayment;

import com.domain.customerPayment.customerPaymentBuilder.product.CustPayment;

public interface CustomerpaymentInterface {

    public void buildAmount(double amount);
    public void buildVat(double vat);
    public void buildSale(double sale);
    public void buildArangement(double arangement);
    public void buildTip(double tip);
    public void buildOrderNumber(String ordeNumber);
    public void buildCustomer(String custNum);
    public void builPayment_type(String p_type);
    public CustPayment getCustPayment();
}
