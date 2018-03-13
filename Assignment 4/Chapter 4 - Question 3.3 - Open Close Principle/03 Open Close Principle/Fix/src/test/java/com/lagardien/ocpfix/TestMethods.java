package com.lagardien.ocpfix;

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
    GraphicEditor graph;
    Shape rect;
    Shape shape;
    @Before
    public void setUp() throws Exception {
        graph = new GraphicEditor();
        rect = new Rectangle();
    }

    @Test
    public void testDrawShape() throws Exception {
        boolean test = false;
        try {
            graph.drawShape(rect);
            test = true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        Assert.assertTrue(test);
    }
}
