package com.lagardien.lspviolation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Ijaaz Lagardien
 * 214167542
 * Group 3A
 * Dr B. Kabaso
 * Date: 13 March 2016.
 */
public class TestMethods
{
    Square sqr;
    Rectangle rect;
    @Before
    public void setUp() throws Exception {
        sqr = new Square();
        rect = new Rectangle();
    }

    @Test
    public void testSetWidth() throws Exception {
        sqr.setWidth(25);
        Assert.assertEquals(25,25);
        rect.setWidth(27);
        Assert.assertEquals(27,27);
    }

    @Test
    public void testSetHeight() throws Exception
    {
        sqr.setHeight(25);
        Assert.assertEquals(25,25);
        rect.setHeight(93);
        Assert.assertEquals(93,93);
    }

    @Test
    public void testGetWidth() throws Exception
    {
        rect.setWidth(25);
        Assert.assertEquals(25,rect.getWidth());
    }

    @Test
    public void testGetHeight() throws Exception {
        rect.setHeight(93);
        Assert.assertEquals(93,rect.getHeight());
    }

    @Test
    public void testGetArea() throws Exception
    {
        rect.setWidth(5);
        rect.setHeight(10);
        Assert.assertEquals(50,rect.getArea());
    }
}
