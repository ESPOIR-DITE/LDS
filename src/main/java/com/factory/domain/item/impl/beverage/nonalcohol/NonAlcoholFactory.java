package com.factory.domain.item.impl.beverage.nonalcohol;

import com.domain.item.impl.beverage.nonalcohol.NonAlcohol;

public class NonAlcoholFactory {
    public static NonAlcohol getNonAlcohol(String nonAlcohol_id,String ContainerType,String naturelPercentage,String item_id){
        return new NonAlcohol.Builder(nonAlcohol_id)
                .buildContaina(ContainerType)
                .buildNaturelPercentage(naturelPercentage)
                .buildItemId(item_id)
                .build();
    }
}
