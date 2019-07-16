package com.factory.services;

import com.service.customerServ.CustomerService;

public class CustomerServiceFac {
    private CustomerService cust;
    public CustomerService getCustomerServ(String s)
    {
        if(s.equalsIgnoreCase("customerService"))
        {
           return cust.getCustomer();
        }
        else
            return null;
    }
}
