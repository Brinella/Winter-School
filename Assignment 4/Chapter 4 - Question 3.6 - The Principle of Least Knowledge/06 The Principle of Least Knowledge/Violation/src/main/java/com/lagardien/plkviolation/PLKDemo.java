package com.lagardien.plkviolation;
/**
 * Ijaaz Lagardien
 * 214167542
 * Group 3A
 * Dr B. Kabaso
 * Date: 13 March 2016
 */
public class PLKDemo
{
	public void process(Order o)
	{
		Message msg = o.getMessage();
		msg.normalize(); //Violation - should have asked parameter to normalize message
		((Message) o.getMessage).normalize(); //Violation - should have used a temporary variable
		
	}
}
