package com.factory.domain.orderLine;

import com.domain.orderLine.OrderLine;

public class OrderLineFactory {
    public static OrderLine getOrderLine( String lineId,String OrderId,String itemID){
        return new OrderLine.Builder(lineId)
                .buildItemID(itemID)
                .buildOrderId(OrderId)
                .build();
    }
}
