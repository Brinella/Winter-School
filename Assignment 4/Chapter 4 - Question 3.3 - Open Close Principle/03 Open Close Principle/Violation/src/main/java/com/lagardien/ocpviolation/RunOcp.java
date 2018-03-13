package com.lagardien.ocpviolation;

/**
 * Ijaaz Lagardien
 * 214167542
 * Group 3A
 * Dr B. Kabaso
 * Date: 13 March 2016
 */
public class RunOcp
{
    public static void main(String[] args)
    {
        Shape rect = new Rectangle();
        Shape circle = new Circle();
        GraphicEditor graphic = new GraphicEditor();
        graphic.drawShape(circle);
        graphic.drawShape(rect);
    }
}
