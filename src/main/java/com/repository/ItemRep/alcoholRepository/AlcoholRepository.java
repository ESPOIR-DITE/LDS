package com.repository.ItemRep.alcoholRepository;

import com.domain.itemBuilder.beverages.alcoholProduct.AlcoholProduct;
import com.repository.Irepository;

import java.util.ArrayList;

public interface AlcoholRepository extends Irepository<AlcoholProduct, String>
{
    ArrayList<String> readAlcol(String type, String id);
    // readAllItems(String type);
}
