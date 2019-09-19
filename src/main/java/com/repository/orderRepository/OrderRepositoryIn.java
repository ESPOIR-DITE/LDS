package com.repository.orderRepository;

import com.domain.orderBuilder.Orders;
import com.repository.Irepository;

public interface OrderRepositoryIn extends Irepository<Orders,String>
{
   String insertAll(Orders orders);
    //ArrayList<OrderClass>orderList();
}
