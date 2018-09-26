/*
 * Author: Ly Nguyen
 * CSC 131
 * 
 * 
 */
public class SizeException extends Exception {
	private String field;
	public SizeException(String field)
	{
		this.field = field;
	}
	public String getField()
	{
		return field;
	}

}
