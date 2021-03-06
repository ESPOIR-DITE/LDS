package com.factory.domain.item.impl.classic;

import com.domain.item.impl.classic.Classic;

public class ClassicFactory {
   public static Classic getClassic(String clissic_id, String color, String item_id){
       return new Classic.Builder(clissic_id)
               .buildColor(color)
               .buildItemId(item_id)
               .build();
   }

}
