package com.lagardien.ocpviolation;

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
    Shape shapeObject;
    Circle circleObject;
    Rectangle rectangleObject;
    GraphicEditor graphic;

    @Before
    public void setUp() throws Exception {
        shapeObject = new Shape();
        circleObject = new Circle();
        rectangleObject = new Rectangle();
        graphic = new GraphicEditor();
    }

    @Test
    public void testDrawShape() throws Exception
    {
        boolean test = false;
        try {
            shapeObject.type = 1;
            graphic.drawShape(shapeObject);
            test = true;
            Assert.assertTrue(test);
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    @Test
    public void testDrawShape2() throws Exception {
        boolean test = false;
        try {
            shapeObject.type = 2;
            graphic.drawShape(shapeObject);
            test = true;
            Assert.assertTrue(test);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
