package com.Emma.Multimodules;

import java.util.Scanner;
import org.junit.Assert;

/**
 * Created by Long on 17/02/2018.
 */
public class runMultiplication  {

    Multiplication multiObject = new Multiplication();

    public void testIntegerInput() throws Exception
    {
        multiObject.setInteger1(9);
        multiObject.setInteger2(7);
        Assert.assertTrue(multiObject.getInteger1() != 0);
        Assert.assertTrue(multiObject.getInteger2() !=0);
    }

    public void testMultiplication() throws Exception
    {
        multiObject.multiply();
    }

}
