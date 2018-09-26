import java.util.ArrayList;
import java.util.List;

/*
 * Author: Ly Nguyen
 * interface for the filter system. 
 * 
 * 09-25: Changed return type to ArrayList, Changed Parameters to List as per specification.
 * 
 */

public interface Filter {
	public ArrayList<Grade> apply(List<Grade> grading) throws SizeException;
}
