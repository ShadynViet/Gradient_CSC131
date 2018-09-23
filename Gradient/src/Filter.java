import java.util.List;

/*
 * Author: Ly Nguyen
 * interface for the filter system. 
 * 
 */

public interface Filter {
	public List<Grade> apply(List<Grade> grading) throws SizeException;
}
