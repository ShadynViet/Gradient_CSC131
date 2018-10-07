package grading;
/*
 * Author: Ly Nguyen
 * 
 * class: Missing Class
 * 
 * Updated: 09-20-2018
 * */
//Used by to WeightedTotalStrategy Class
public class Missing {
	final private static double DEFAULT_MISSING_VALUE = 0.0;
	
	public static double doubleValue(Double number) 
	{
		if(number == null) 
		{
			//print default
			return DEFAULT_MISSING_VALUE;
		}
		else 
		{
			return number *2;
		}
	}
	public static double doubleValue(Double number, double missingValue) 
	{
		if(number == (null)) 
		{
			return missingValue;
		}
		else
		{
			return missingValue * number;
		}
	}
	
}
