package com.company;

public class Lab2 {
    public static void main(String[] args) {
        int result = divide(4,2);
        System.out.println(result);
        result = sum(2,3);
        System.out.println(result);
        result = decrease(6,3);
        System.out.println(result);
        result = modul(27 , 100);
        System.out.println(result);


    }
    static int sum(int firstNumber , int secondNumber){

        return (firstNumber + secondNumber);
    }
    static int divide(int firstNumber , int secondNumber){

        return (firstNumber / secondNumber);
    }
    static int decrease(int firstNunmber , int secondNumber){
        return (firstNunmber - secondNumber);
    }
    static int modul(int firstNumber , int secondNumber){
        return (firstNumber % secondNumber);
    }
}
