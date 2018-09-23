/*
 * Author: Ly Nguyen
 * Interface for Grading Strategies
 * 
 * 
*/
import java.util.*;
public interface GradingStrategy {
	public Grade calculate(String key, List<Grade> grading) throws SizeException;
}
