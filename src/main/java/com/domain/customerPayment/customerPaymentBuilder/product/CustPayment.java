package com.domain.customerPayment.customerPaymentBuilder.product;

public class CustPayment
{
    private String customerNumber;
    private String orderNumber;
    private double amount;
    private double vat;
    private double sale;
    private double arrengement;
    private double tip;
    private String payment_type;


    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public double getArrengement() {
        return arrengement;
    }

    public void setArrengement(double arrengement) {
        this.arrengement = arrengement;
    }

    @Override
    public String toString() {
        return "CustPayment\n------------" +
                "\namount:      " + amount +
                "\nvat:        " + vat +
                "\nsale:       " + sale +
                "\narrengement:" + arrengement+
                "\ntip:        " + tip +
                "\nPay_type:   " + payment_type ;
    }/**
    public static class Builder {
        private String customerNumber;
        private String orderNumber;
        private double amount;
        private double vat;
        private double sale;
        private double arrengement;
        private double tip;
        private String payment_type;

        public Builder(String customerNumber) {

            this.customerNumber=customerNumber;
        }
        public Builder buildOrderNumber(String orderNumber){
            this.orderNumber=orderNumber;
            return this;
        }
        public Builder buildAmount(double amount){
            this.amount=amount;
            return this;
        }
        public Builder buildVat(double vat){
            this.vat=vat;
            return this;
        }
        public Builder buildsale(double sale){
            this.sale=sale;
            return this;
        }
        public Builder buildArrengement(double arrengement){
            this.arrengement=arrengement;
            return this;
        }
        public Builder buildTip(double tip){
            this.tip=tip;
            return this;
        }
        public Builder buildPayment(String payment_type){
            this.payment_type=payment_type;
            return this;
        }
        public CustPayment build(){

            CustPayment custPayment=new CustPayment();
            custPayment.amount=this.amount;
            custPayment.arrengement=this.arrengement;
            custPayment.customerNumber=this.customerNumber;
            custPayment.payment_type=this.payment_type;
            custPayment.orderNumber=this.orderNumber;
            custPayment.sale=this.sale;
            custPayment.tip=this.tip;
            return custPayment;
        }
    }*/
}
