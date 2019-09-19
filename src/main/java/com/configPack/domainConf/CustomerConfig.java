package com.configPack.domainConf;

import com.factory.domain.customerFactory.CustomerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
    @Bean(name = "getCustomer")
    public CustomerFactory getCustomerService()
    {
        return new CustomerFactory();
    }
}
