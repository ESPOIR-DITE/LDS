package com.domain.itemBuilder.beverages.alcoholProduct;

public class AlcoholProduct {


    private String percentageOfAlcohol;
    private char size;
    private String type;
    private String ItemNumber;
    private String itemName;
    private String itemDescription;
    private double price;
    private String itemCategory;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPercentageOfAlcohol() {
        return percentageOfAlcohol;
    }

    public void setPercentageOfAlcohol(String percentageOfAlcohol) {
        this.percentageOfAlcohol = percentageOfAlcohol;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getItemNumber() {
        return ItemNumber;
    }

    public void setItemNumber(String itemNumber) {
        ItemNumber = itemNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String category) {
        this.itemCategory = category;
    }

    @Override
    public String toString() {
        return "AlcoholProduct{" +
                "percentageOfAlcohol='" + percentageOfAlcohol + '\'' +
                ", size=" + size +
                ", type='" + type + '\'' +
                ", ItemNumber='" + ItemNumber + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", price=" + price +
                ", itemCategory='" + itemCategory + '\'' +
                '}';
    }
}
