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
    public void plingPlangPlongTrueTests()
    {
        Assert.assertEquals("Pling", PlingPlangPlong.calculateResult(6));
        Assert.assertEquals("Plang", PlingPlangPlong.calculateResult(10));
        Assert.assertEquals("Plong", PlingPlangPlong.calculateResult(14));
        Assert.assertEquals("PlingPlang", PlingPlangPlong.calculateResult(15));
        Assert.assertEquals("PlingPlong", PlingPlangPlong.calculateResult(21));
        Assert.assertEquals("PlangPlong", PlingPlangPlong.calculateResult(35));
        Assert.assertEquals("PlingPlangPlong", PlingPlangPlong.calculateResult(210));
    }

}
