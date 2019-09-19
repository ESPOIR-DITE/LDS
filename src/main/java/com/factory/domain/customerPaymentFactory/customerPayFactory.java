package com.factory.domain.customerPaymentFactory;

import com.domain.customerPayment.CustomerpaymentInterface;
import com.domain.customerPayment.customerPaymentBuilder.Cash;
import com.domain.customerPayment.customerPaymentBuilder.Credit;

public class customerPayFactory {
    public CustomerpaymentInterface getCustPayment(String type)
    {
        if(type.equalsIgnoreCase("credit"))
        {
            return new Credit();
        }
        if(type.equalsIgnoreCase("cash"))
        {
            return new Cash();
        }else return null;
    }
}
