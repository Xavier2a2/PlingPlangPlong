package com.sparta.aaron;

import com.sparta.aaron.util.Printer;
import com.sparta.aaron.PlingPlangPlong.PlingPlangPlong;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Printer.print(PlingPlangPlong.calculateResult(84));
        Printer.print(PlingPlangPlong.calculateResult(23));
        Printer.print(PlingPlangPlong.calculateResult(12));
        Printer.print(PlingPlangPlong.calculateResult(30));
        Printer.print(PlingPlangPlong.calculateResult(105));
        Printer.print(PlingPlangPlong.calculateResult(70));
    }
}
