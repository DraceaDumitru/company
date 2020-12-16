package com.company;

public class Calculator {
    public int addition;
    public int substration;
    public int division;
    public int multiplication;

    public int getAddition(int firstNr , int secondNr){
        return(firstNr+secondNr);
    }
    public int getSubstration(int firstNr , int secondNr){
        return (firstNr-secondNr);

    }
    public int getDivision(int firstNr , int secondNr){
        return(firstNr/secondNr);
    }
    public int getMultiplication(int firstNr , int secondNr){
        return(firstNr*secondNr);
    }
}
