package com.company.animalRescuer;

public class Animal {

        /*animal: nume, vârstă, nivelul stării de sănătate (de la 1 la 10),
         nivelul senzației de foame (de la 1 la 10), nivelul stării de spirit (de la 1 la 10),\
          numele mâncării preferate, numele activității de recreere preferate
          */
        private String name;
        private int age;
        private int levelOfHealth;
        private int hungerLevel;
        private int moodLevel;
        private String preferatFood;
        private String favoriteRecreationalActivities;

        public String getName(){
                return name;
        }
        public void setName(String name){
                this.name = name;
        }
        public int getAge(){
                return age;
        }
        public void setAge(int age){
                this.age = age;
        }
        public int getLevelOfHealth(){
                return levelOfHealth;
        }
        public void setLevelOfHealth(int levelOfHealth){
                this.levelOfHealth = levelOfHealth;
        }
        public int getHungerLevel(){
                return hungerLevel;
        }
        public void setHungerLevel(int hungerLevel){
                this.hungerLevel = hungerLevel;
        }
        public int getMoodLevel(){
                return moodLevel;
        }
        public void setMoodLevel(int moodLevel){
                this.moodLevel = moodLevel;
        }
        public String getPreferatFood(){
                return preferatFood;
        }
        public void setPreferatFood(String preferatFood){
                this.preferatFood = preferatFood;
        }
        public String getFavoriteRecreationalActivities(){
                return favoriteRecreationalActivities;
        }
        public void setFavoriteRecreationalActivities(String favoriteRecreationalActivities){
                this.favoriteRecreationalActivities = favoriteRecreationalActivities;
        }
}
