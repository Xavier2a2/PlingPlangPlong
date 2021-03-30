package com.sparta.aaron;

import static org.junit.Assert.assertTrue;

import com.sparta.aaron.PlingPlangPlong.PlingPlangPlong;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void plingPlangPlongTrueTests()
    {
        Assert.assertTrue(PlingPlangPlong.calculateResult(6).equals("Pling"));
        Assert.assertTrue(PlingPlangPlong.calculateResult(10).equals("Plang"));
        Assert.assertTrue(PlingPlangPlong.calculateResult(14).equals("Plong"));
        Assert.assertTrue(PlingPlangPlong.calculateResult(15).equals("PlingPlang"));
        Assert.assertTrue(PlingPlangPlong.calculateResult(21).equals("PlingPlong"));
        Assert.assertTrue(PlingPlangPlong.calculateResult(35).equals("PlangPlong"));
        Assert.assertTrue(PlingPlangPlong.calculateResult(210).equals("PlingPlangPlong"));
    }

}
