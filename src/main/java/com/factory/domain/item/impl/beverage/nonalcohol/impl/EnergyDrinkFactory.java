package com.factory.domain.item.impl.beverage.nonalcohol.impl;

import com.domain.item.impl.beverage.nonalcohol.impl.CoolDrink;
import com.domain.item.impl.beverage.nonalcohol.impl.EnergyDrink;

public class EnergyDrinkFactory {
    public static EnergyDrink getEnergyDrink(String id, String name){
        return new EnergyDrink.Builder(id).buildName(name).build();
    }
}
