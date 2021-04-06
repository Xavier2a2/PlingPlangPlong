package com.sparta.aaron;

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
    public void plingTest(){
        Assert.assertEquals("Pling", PlingPlangPlong.calculateResult(3));
        Assert.assertEquals("Pling", PlingPlangPlong.calculateResult(6));
        Assert.assertEquals("Pling", PlingPlangPlong.calculateResult(9));
    }

    @Test
    public void plangTest(){
        Assert.assertEquals("Plang", PlingPlangPlong.calculateResult(5));
        Assert.assertEquals("Plang", PlingPlangPlong.calculateResult(10));
        Assert.assertEquals("Plang", PlingPlangPlong.calculateResult(20));
    }

    @Test
    public void plongTest(){
        Assert.assertEquals("Plong", PlingPlangPlong.calculateResult(7));
        Assert.assertEquals("Plong", PlingPlangPlong.calculateResult(14));
        Assert.assertEquals("Plong", PlingPlangPlong.calculateResult(28));
    }

    @Test
    public void combinationsTest()
    {
        Assert.assertEquals("PlingPlang", PlingPlangPlong.calculateResult(15));
        Assert.assertEquals("PlingPlong", PlingPlangPlong.calculateResult(21));
        Assert.assertEquals("PlangPlong", PlingPlangPlong.calculateResult(35));
    }

    @Test
    public void plingPlangPlongTest()
    {
        Assert.assertEquals("PlingPlangPlong", PlingPlangPlong.calculateResult(210));
    }

}
