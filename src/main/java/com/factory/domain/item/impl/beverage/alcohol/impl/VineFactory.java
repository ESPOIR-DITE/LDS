package com.factory.domain.item.impl.beverage.alcohol.impl;

import com.domain.item.impl.beverage.alcohol.impl.Vine;

public class VineFactory {
    public static Vine getVine(String id, String name) {
        return new Vine.Builder(id).buildName(name).build();
    }
}
