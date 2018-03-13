package com.lagardien.ocpviolation;
/**
 * Ijaaz Lagardien
 * 214167542
 * Group 3A
 * Dr B. Kabaso
 * Date: 13 March 2016
 */
public class GraphicEditor
{
	public void drawShape(Shape s)
	{
		if(s.type == 1)
		{
			drawRectangle();
		}
		else if(s.type == 2)
		{
			drawCircle();
		}
	}
	
	public void drawCircle()
	{
		System.out.println("This is supposed to be a circle");
	}
	
	public void drawRectangle()
	{
		System.out.println("This is supposed to be a Rectangle");
	}
}
