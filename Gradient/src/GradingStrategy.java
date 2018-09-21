/*
 * Author: Ly Nguyen
 * Interface for Grading Strategies
 * 
 * 
*/
import java.util.LinkedList;
public interface GradingStrategy {
	public Grade calculate(String key, LinkedList<Grade> grading) throws SizeException;
}
