package com.company;

public class Main {

    public static void main(String[] args) {
                //Ex 1
        myName();
                //Ex 2
        Calculator calculator = new Calculator();
        System.out.println("addition result = "+calculator.getAddition(5,4));
        System.out.println("substraction result = "+calculator.getSubstration (10,2));
        System.out.println("division result = "+calculator.getDivision(8,2));
        System.out.println("multiplication result = "+calculator.getMultiplication(5,8));
                //Ex 3
        javaLogo();
                //Ex 4
        averageNumbers();
                //Ex 5
        smilley();
                //Ex 6
        divisionRest();
                //Ex 7
        fºToCº();
                //Ex8
        inchToMeters();
                //Ex9
        distance(10,180,300,00);

                //LogicalOp ex
        LogicalOp logicalOp = new LogicalOp();
        int biggest = logicalOp.checkBiggerNumber(3,1);
        System.out.println();
        System.out.println("The bigger number is : "+biggest);
        System.out.println();

        LogicalOp  logicalOp1 = new LogicalOp();
        String compare = logicalOp1.compareStrings();
        System.out.println();

        LogicalOp logicalOp2 = new LogicalOp();
        String snowcm = logicalOp2.snowCm("");
        System.out.println();

        LogicalOp logicalOp3 = new LogicalOp();
        String numbers = logicalOp3.compareNumbers("");
        System.out.println();

    }
                //Ex 1
     static void myName(){
        System.out.println("Dan");
        System.out.println();
    }
                //Ex 3
    public static void javaLogo(){
        System.out.println();
        System.out.println("     jj     aaa   vv      vv   aaa    ");
        System.out.println("     jj    aa aa   vv    vv   aa aa   ");
        System.out.println("     jj   aaaaaaa   vv  vv   aaaaaaa  ");
        System.out.println("jjj  jj  aa     aa   vvvv   aa     aa ");
        System.out.println(" jjjjjj aa       aa   vv   aa       aa");
        System.out.println();
    }
    //Ex 4
    static void averageNumbers(){
        System.out.println();
        int average = (3*4*6)/3;
        System.out.println("average numbers = "+average);
        System.out.println();
    }

    //Ex 5 , aici am folosit key-uri din codul ascii cu alt si key-urile 178,192,191,217,218,247,148,179,196,227
    public static void smilley(){
        System.out.println("   ┌πππππππππ┐   +'''''''''+  ");
        System.out.println("   │  Ö   Ö  │  [|  O   O  |] ");
        System.out.println("  [│  ≈≈^≈≈  │]  |    ^    |  ");
        System.out.println("   │  '───'  │   |   '-'   |  ");
        System.out.println("   │   ▓▓▓   │   |         |  ");
        System.out.println("   └---------┘   +'''''''''+  ");
    }
    //Ex 6
    static void divisionRest(){
        System.out.println();
        double rest = (9D/4D)%3D ;
        System.out.println("division rest = "+rest);
    }
    //Ex 7
    static void fºToCº(){
        System.out.println();
        System.out.println();
        double Fº = 140D ;
        double Cº = (Fº - 32 )*5/9 ;
        System.out.println("Celsius grade = "+ Cº);
        System.out.println();
    }
    //Ex 8
    static void inchToMeters(){
        System.out.println();
        double inchToMeter = 0.0254D;
        double meters= 100*0.0254D;
        System.out.println("distance in meters = "+meters);
        System.out.println();
    }
    //Ex 9
    public static void distance( double distance , int hour , int minutes , int seconds ){
        double metersPerSecond = distance/((hour*3600)+(minutes*60)+seconds);
        System.out.println("Meters per second : "+metersPerSecond);
        double kilometersPerHour = metersPerSecond*3.6;
        System.out.println("Kilometers per hour : "+kilometersPerHour);
        double milesPerHour = kilometersPerHour/1.609;
        System.out.println("Miles per hour : "+milesPerHour);
    }
}
