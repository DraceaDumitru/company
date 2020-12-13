package com.company.animalRescuer;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Veterinarian veterinarian = new Veterinarian();
        FoodForAnimal foodForAnimal = new FoodForAnimal();
        Adoption adoption = new Adoption();
        RecreationActivity recreationActivity = new RecreationActivity();

        System.out.println("Name of animal : "+animal.name);
        System.out.println("Age of animal : "+animal.age+" year");
        System.out.println("Recreation : "+animal.favoriteRecreationalActivities);
        System.out.println("Hunger level : "+animal.hungerLevel);
        System.out.println("Mood level : "+animal.moodLevel);
        System.out.println("Preferat food : "+animal.preferatFood);
        System.out.println("Level of health"+animal.levelOfHealth);
        System.out.println();
        System.out.println("Name of Vet Doc : "+veterinarian.name);
        System.out.println("Specialization : "+veterinarian.specialization);
        System.out.println();
        System.out.println("Food name : "+foodForAnimal.name);
        System.out.println("Price : "+foodForAnimal.price+" $");
        System.out.println("Quantity : "+foodForAnimal.quantity+" KG");
        System.out.println("Stock : "+foodForAnimal.stockAvailable+" Kg");
        System.out.println();
        System.out.println("Name : "+adoption.name);
        System.out.println("Money available : "+adoption.amountOfMoneyAvailable+" $");
        System.out.println();
        System.out.println("Activitity : "+recreationActivity.activity);
        System.out.println();
    }
}
