package com.lagardien.lspfix;

/**
 * Ijaaz Lagardien
 * Group 3A
 * Dr B. Kabaso
 * Date: 13 March 2016
 */
public class RunLSP {
    private static Rectangle getNewRectangle()
    {
        return new Rectangle();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Rectangle r = RunLSP.getNewRectangle();
        r.setHeight(5);
        r.setWidth(10);
        System.out.println(r.getArea());
    }
}
