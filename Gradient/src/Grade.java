import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public final class Grade implements Comparable<Grade>{

	public String key;
	public double value;
		
	public Grade(String k)
	{
		if (k.equals(null))
			throw new IllegalArgumentException("You must enter a key!");
		key = k;
		value = 0.0;	
	}
	
	public int compareTo(Grade other)
	{
		//this.value null and other not null
		if(this.value == 0 && other.value != 0)
		{
			return -1;
		}
		//both null
		else if(this.value == 0 && other.value == 0)
		{
			return 0;
		}
		//this not null. other is null
		else if(this.value != 0 && other.value == 0) 
		{
			return 1;
		}
		//both not null
		else if (this.value != 0 && other.value !=0) 
		{
			return Integer.compare((int)this.value, (int)other.value); 
		}
		return 0;
	}
	
	public String toString() 
	{
		String s = "";
		//if value not null print everything
		if (this.value != 0.0) 
		{
			//print the key;
			s = printKey();
			NumberFormat formatter = new DecimalFormat("#0.0");
			s += formatter.format(this.value);
		}
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
