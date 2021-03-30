package org.example.PlingPlangPlong;

public class PlingPlangPlong {

    static String plingPlangPlong(int number){
        String output = "";

        if(number%3==0){
            output += "Pling";
        } else if(number%5==0){
            output += "Plang";
        }else if(number%7==0){
            output += "Plong";
        }

        if (output.equals("")) return number +"";

        return output;
    }
}
