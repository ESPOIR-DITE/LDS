package com.factory.domain.item.impl.beverage.alcohol.impl;

import com.domain.item.impl.beverage.alcohol.impl.Beer;

public class BeerFactory {

public static Beer getBeer(String id, String name){
    return new Beer.Builder(id).buildName(name).build();
}
}
