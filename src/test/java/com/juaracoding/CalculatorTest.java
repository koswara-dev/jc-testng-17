package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();
    double a = 10, b = 5;

    @Test
    public void testAdd(){
        double expected = 15;
        double actual = calculator.add(a,b);
        // Validate/Verify
        // Assert.assertEquals(calculator.add(10,5), 15);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSubtract(){
        double expected = 5;
        double actual = calculator.subtract(a,b);
        Assert.assertEquals(actual, expected);
    }

    // assert
    @Test
    public void testNumberGreaterThan(){
        int number = 21;
        boolean actual = number > 15;
        Assert.assertTrue(actual);
    }

    @Test
    public void testCompareString(){
        String actual = "Berhasil login";
        String expected = "login";
        Assert.assertTrue(actual.contains(expected));
    }



}
