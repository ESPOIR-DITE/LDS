package com.domain.driverPay;

public class DriverPay {

    private int rate;
    private int numberOfOrder;
    private double salary;
    private int distance;
    private String payType;
    private String driverBumber;
    private String payDate;
    private String payCode;

    private DriverPay() {
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    public String getDriverBumber() {
        return driverBumber;
    }

    public void setDriverBumber(String driverBumber) {
        this.driverBumber = driverBumber;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDistance() {
        return distance;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    public void setNumberOfOrder(int numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }

    public void setSalary() {
        salary = rate * numberOfOrder;
    }

    public void setDistance(int distan) {
        this.distance = distan;
    }

    public double getSalary() {
        return salary = rate * numberOfOrder;
    }

    @Override
    public String toString() {
        return "\nDriver Pay" + "" + "\n------------\n" +
                "Paycode:        " + payCode + "\n" +
                "rate:           " + rate + "\n" +
                "numberOfOrder:  " + numberOfOrder + "\n" +
                "salary:         " + getSalary() + "\n" +
                "Distance        " + distance + "\n" +
                "payment Type    " + payType + "\n" +
                "driver number   " + driverBumber + "\n" +
                "Date            " + payDate + "\n"
                ;
    }

    public static class Builder {
        private int rate;
        private int numberOfOrder;
        private double salary;
        private int distance;
        private String payType;
        private String driverBumber;
        private String payDate;
        private String payCode;

        public Builder(String payCode) {
            this.payCode = payCode;
        }

        public Builder buildNumberOfOrder(int numberOfOrder) {
            this.numberOfOrder = numberOfOrder;
            return this;
        }

        public Builder buildSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Builder buildDistance(int distance) {
            this.distance = distance;
            return this;
        }

        public Builder buildPayType(String payType) {
            this.payType = payType;
            return this;
        }

        public Builder buildDriverBumber(String driverBumber) {
            this.driverBumber = driverBumber;
            return this;
        }

        public Builder buildPayDate(String payDate) {
            this.numberOfOrder = numberOfOrder;
            return this;
        }

        public Builder buildRate(int rate) {
            this.rate = rate;
            return this;
        }

        public DriverPay build() {
            DriverPay driverPay = new DriverPay();
            driverPay.distance = this.distance;
            driverPay.driverBumber = this.driverBumber;
            driverPay.numberOfOrder = this.numberOfOrder;
            driverPay.payCode = this.payCode;
            driverPay.payType = this.payType;
            driverPay.rate = this.rate;
            driverPay.salary = this.salary;
            driverPay.payDate = this.payDate;
            return driverPay;
        }
    }
}
