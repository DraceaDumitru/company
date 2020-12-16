package com.company.animalRescuer;

public class Adoption {
    /* nume, sumă de bani disponibilă */
    private String name;
    private int amountOfMoneyAvailable;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAmountOfMoneyAvailable(){
        return amountOfMoneyAvailable;
    }
    public void setAmountOfMoneyAvailable(int amountOfMoneyAvailable){
        this.amountOfMoneyAvailable =amountOfMoneyAvailable;
    }
}
