package com.factory.domain.item.impl.classic.impl;

import com.domain.item.impl.classic.impl.Cigarate;
import com.domain.item.impl.classic.impl.Snakes;

public class SnakesFactory {
    public static Snakes getSnakes(String id, String name){
        return new Snakes.Builder(id).buildName(name).build();
    }
}
