package com.company.animalRescuer;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Veterinarian veterinarian = new Veterinarian();
        FoodForAnimal foodForAnimal = new FoodForAnimal();
        Adoption adoption = new Adoption();
        RecreationActivity recreationActivity = new RecreationActivity();
        animal.setName("Kitty");
        animal.setAge(1);
        animal.setFavoriteRecreationalActivities("Sleep , playing with toys");
        animal.setHungerLevel(2);
        animal.setMoodLevel(1);
        animal.setPreferatFood("fish");
        animal.setLevelOfHealth(2);
        veterinarian.setName("Alize Laflamour");
        veterinarian.setSpecialization("Vet Doctor");
        foodForAnimal.setName("Wishkat");
        foodForAnimal.setPrice(2);
        foodForAnimal.setQuantity(10);
        foodForAnimal.setStockAvailable(882);
        adoption.setName("Kim Ji-Young");
        adoption.setAmountOfMoneyAvailable(420);
        recreationActivity.setActivity("walk");

        System.out.println("Name of animal : "+animal.getName());
        System.out.println("Age of animal : "+animal.getAge()+" year");
        System.out.println("Recreation : "+animal.getFavoriteRecreationalActivities());
        System.out.println("Hunger level : "+animal.getHungerLevel());
        System.out.println("Mood level : "+animal.getMoodLevel());
        System.out.println("Preferat food : "+animal.getPreferatFood());
        System.out.println("Level of health : "+animal.getLevelOfHealth());
        System.out.println();
        System.out.println("Name of Vet Doc : "+veterinarian.getName());
        System.out.println("Specialization : "+veterinarian.getSpecialization());
        System.out.println();
        System.out.println("Food name : "+foodForAnimal.getName());
        System.out.println("Price : "+foodForAnimal.getPrice()+" $");
        System.out.println("Quantity : "+foodForAnimal.getQuantity()+" KG");
        System.out.println("Stock : "+foodForAnimal.getStockAvailable()+" Kg");
        System.out.println();
        System.out.println("Name : "+adoption.getName());
        System.out.println("Money available : "+adoption.getAmountOfMoneyAvailable()+" $");
        System.out.println();
        System.out.println("Activitity : "+recreationActivity.getActivity());
        System.out.println();
    }
}
