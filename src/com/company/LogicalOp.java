package com.company;

public class LogicalOp {
    public int checkBiggerNumber(int first, int second) {
        int x = 3;
        int y = 1;
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String compareStrings() {
        String text1 = "FastTrackIt";
        String text2 = "LeagueOfLegends";
        if (text1.equals(text2)) {
            System.out.println("They are same ! ");
        } else if (!text1.equals(text2)) {
            System.out.println("They are not same ! ");
            System.out.println("League of Legends is more long ");
        }
        return text1;
    }

    public String snowCm(String snow ) {
        int cm = 30;
        int cm2 = 2;
        if (cm >= cm2) {
            System.out.println("The amount of snow in this winter was : " + cm + "cm");
        } else {
            System.out.println("The forecast snow is : " + cm2 + "cm");
        }

        return snow;
    }

    public String compareNumbers(String numbers){
        int nr1 = 5 ;
        if (nr1>3&&nr1!=4){
            System.out.println(nr1+" <-This number is greater than 3 and not equal to 4 ");
        }else if (nr1<3){
            System.out.println("The number is equal to 4 ");
            System.out.println("The number is lower than 3 ");
        }
        return numbers ;
    }

}