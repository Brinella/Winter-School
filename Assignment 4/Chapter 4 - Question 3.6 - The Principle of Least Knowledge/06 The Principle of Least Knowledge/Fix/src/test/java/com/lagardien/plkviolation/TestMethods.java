package com.lagardien.plkviolation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Ijaaz Lagardien
 * 214167542
 * Group 3A
 * Dr B. Kabaso
 * Date: 13 March 2016
 */
public class TestMethods
{
    private PLKDemo plk;
    private  Order orderObect;
    private  boolean test = false;
    @Before
    public void setUp() throws Exception {
        plk = new PLKDemo();
        orderObect = new Order();
    }

    @Test
    public void testProcess() throws Exception {
        try{
            plk.process(orderObect);
            test = true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        Assert.assertTrue(test);
    }

    @Test
    public void testNormalise() throws Exception
    {
        try {
            orderObect.normalize();
            test = true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        Assert.assertTrue(test);
    }
}
