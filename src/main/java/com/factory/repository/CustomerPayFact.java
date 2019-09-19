package com.factory.repository;

import com.repository.payment.customerPay.CustomerPayRep;

public class CustomerPayFact {
    CustomerPayRep customerPayRep;
    public CustomerPayRep getCustPayRep() {
        return CustomerPayRep.getCustomerRep();
    }
}
