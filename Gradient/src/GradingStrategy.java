/*
 * Author: Ly Nguyen
 * Interface for Grading Strategies
 * 
 * 
*/
import java.util.LinkedList;
import java.util.*
public interface GradingStrategy {
	public Grade calculate(String key, LinkedList<Grade> grading) throws SizeException;
}
