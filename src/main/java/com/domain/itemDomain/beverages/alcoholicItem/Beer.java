package com.domain.itemDomain.beverages.alcoholicItem;

import com.domain.itemBuilder.beverages.alcoholProduct.Alcohol;
import com.domain.itemBuilder.beverages.alcoholProduct.AlcoholProduct;

public class Beer implements Alcohol {

    AlcoholProduct alcoholProduct;

    public Beer() {
        alcoholProduct =new AlcoholProduct();
    }

    @Override
    public void percentageOfAlcohol(String percentage) {
        alcoholProduct.setPercentageOfAlcohol(percentage);
    }


    @Override
    public void buildItemSize(char size) {
        alcoholProduct.setSize(size);
    }

    @Override
    public void buildItemNumber(String number) {
        alcoholProduct.setItemNumber(number);
    }

    @Override
    public void buildItemName(String name) {
        alcoholProduct.setItemName(name);
    }

    @Override
    public void buildItemDescription(String description) {
        alcoholProduct.setItemDescription(description);
    }

    @Override
    public void buildItemPrice(double price) {
        alcoholProduct.setPrice(price);
    }

    @Override
    public void buildCategory(String ctegory) {
        alcoholProduct.setItemCategory(ctegory);
    }

    @Override
    public AlcoholProduct getAlcoholProduct() {
        return alcoholProduct;
    }


}
