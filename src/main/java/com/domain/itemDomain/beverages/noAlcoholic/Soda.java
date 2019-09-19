package com.domain.itemDomain.beverages.noAlcoholic;

import com.domain.itemBuilder.beverages.noAlcoholProduct.NoAlcoholicItemInterface;
import com.domain.itemBuilder.beverages.noAlcoholProduct.NoAlcoholicProduct;

public class Soda implements NoAlcoholicItemInterface {

    NoAlcoholicProduct noAlcoholicProduct;




    @Override
    public void buildItemSize(char size) {

        noAlcoholicProduct.setSize(size);
    }

    @Override
    public void buildItemNumber(String number) {
        noAlcoholicProduct.setItemNumber(number);
    }

    @Override
    public void buildItemName(String name) {
        noAlcoholicProduct.setItemName(name);
    }

    @Override
    public void buildItemDescription(String description) {
        noAlcoholicProduct.setItemDescription(description);
    }

    @Override
    public void buildItemPrice(double price)
    {
        noAlcoholicProduct.setPrice(price);

    }

    @Override
    public void buildCategory(String ctegory) {
        noAlcoholicProduct.setItemCategory(ctegory);
    }

    @Override
    public NoAlcoholicProduct getNoAlcohol() {
        return noAlcoholicProduct;
    }
}
