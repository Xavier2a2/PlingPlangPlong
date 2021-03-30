package org.example.PlingPlangPlong;

public class PlingPlangPlong {

    public static String calculateResult(int number){
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
