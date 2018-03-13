package com.lagardien.lspviolation;

/**
 * Ijaaz Lagardien
 * Group 3A
 * Dr B. Kabaso
 * Date: 13 March 2016.
 */
public class RunLsp
{
    private static Rectangle getNewRectangle()
    {
        return new Square();
    }

    public static void main(String[] args) {
        Rectangle r = RunLsp.getNewRectangle();
        r.setHeight(5);
        r.setWidth(10);
        System.out.println(r.getArea());
    }
}
