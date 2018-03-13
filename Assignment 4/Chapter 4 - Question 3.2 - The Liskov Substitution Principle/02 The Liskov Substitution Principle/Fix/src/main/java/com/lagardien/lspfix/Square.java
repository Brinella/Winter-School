package com.lagardien.lspfix;

/**
 * Ijaaz Lagardien
 * 214167542
 * Group 3A
 * Dr B. Kabaso
 * Date: 16 March 2016
 */
public class Square  extends Rectangle
{
    private int width;
    private int height;

    public void setWidth(int width)
    {
        this.width = width;
        this.height = width;
    }

    public void setHeight(int height)
    {
        this.height = height;
        this.width = height;
    }
}

