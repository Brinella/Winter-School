package com.lagardien.lspfix;

/**
 * Ijaaz Lagardien
 * Group 3A
 * 214167542
 * Dr B. Kabaso
 * Date: 13 March 2016
 */
public class Rectangle
{
    private int width;
    private int height;

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public int getArea()
    {
        return width * height;
    }
}
