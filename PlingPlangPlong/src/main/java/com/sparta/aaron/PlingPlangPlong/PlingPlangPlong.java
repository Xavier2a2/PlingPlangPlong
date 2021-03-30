package com.sparta.aaron.PlingPlangPlong;

public class PlingPlangPlong {

    public static String calculateResult(int number){
        if(number <= 0|| number >= Integer.MAX_VALUE){
            return "Input: "+ number + "\nInvalid number. Please input a number greater than 0." ;
        }
        String output = "";

        if(number%3==0){
            output += "Pling";
        }
        if(number%5==0){
            output += "Plang";
        }
        if(number%7==0){
            output += "Plong";
        }
        if (output.equals("")) return number +"";

        return output;
    }
}
