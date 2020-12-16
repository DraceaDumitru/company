package com.company.animalRescuer;

public class FoodForAnimal {
    /*nume, preț, cantitate, disponibilitate în stoc  */
    private String name;
    private int price;
    private double quantity;
    private int stockAvailable;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public double getQuantity(){
        return quantity;
    }
    public void setQuantity(double quantity){
        this.quantity = quantity;
    }
    public int getStockAvailable(){
        return stockAvailable;
    }
    public void setStockAvailable(int stockAvailable){
        this.stockAvailable = stockAvailable;
    }
}
