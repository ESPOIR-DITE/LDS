package com.factory.repository;

import com.repository.customerRepPack.CustomerRepository;

public class CustomerRepoFac {
    CustomerRepository customerRepository,customerRepository2;

    public static CustomerRepository getCustomerRepository() {
        return CustomerRepository.getInstance();

    }
}
