package grading;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

/*
 * Author: LY Nguyen
 * 			Class Created Sept 18, 2018
 * 			10/06: Revised ToStringMethod
 * 				   Revised compareTo.
 */

public final class Grade implements Comparable<Grade>{

	private String key;
	private double value;
		
	public Grade(String k)
	{
//		if (k.equals(null))
//			throw new IllegalArgumentException("You must enter a key!");
//		else			key = k;
//			value = 0.0;	
		try {
			key = k;
			value = Missing.doubleValue(null);		//RETURNS DEFAULT_VALUE
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println("Grade Constructor: key is null.");
		}
	}
	
	public Grade(String k, double v) 
	{
//		if (k.equals(null))
//			throw new IllegalArgumentException("Grade input requires a key or grade");
//		else
//			key = k;
//			value = v;
		try {
			key = k;
			value = v;
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println("Grade Constructor 2: Key is null");
		}
	}
	
	public Grade(String k, Double v) 
	{
//		
//		if (k.equals(null) /*|| v.equals(0.0)*/)
//			throw new IllegalArgumentException("Grade input requires a key or grade");
//		else
//			key = k;
//			value = v;
		try {
			key = k;
			value = Missing.doubleValue(null);		//Returns DEFAULT_VALUE
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println("Grade Constructor 3: Key is null");
		}
	
	}
	
	public int compareTo(Grade other)
	{
		//this.value null and other not null
		if(this.value == 0.0 && other.value != 0.0)
		{
			return -1;
		}
		//both null
		else if(this.value == 0.0 && other.value == 0.0)
		{
			return 0;
		}
		//this not null. other is null
		else if(this.value != 0.0 && other.value == 0.0) 
		{
			return 1;
		}
		//both not null
		else if (this.value != 0.0 && other.value != 0.0) 
		{
			return Integer.compare((int)this.getValue(), (int)other.getValue()); 
		}
		return 0;
	}
	
	//Access Methods
	public String getKey() 
	{
		return key;
	}
	public double getValue() 
	{
		return value;
	}
	
	public String toString() 
	{
		String s = "";
		
		//print the key;
		s = printKey();
		NumberFormat formatter = new DecimalFormat("#0.0");
		s += formatter.format(this.value);	
		return s;
	}
	//print keys with : + a space
	private String printKey() 
	{
		String s = "";
		for (int i = 0; i < key.length(); i++) 
		{
			s += key.charAt(i);
		}
		s += ": ";
		return s;
		
	}
	
	
}
