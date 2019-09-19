package com.factory.domain.item.impl.beverage.alcohol.impl;

import com.domain.item.impl.beverage.alcohol.impl.Whisky;

public class WhiskyFactory {
   public static Whisky getWhisky(String id, String name){
       return new Whisky.Builder(id).buildName(name).build();
   }
}
