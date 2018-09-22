/*
 *Author: Ly Nguyen
 *Updated: 09/21/2018
 *			-Created Class.
 */

import java.util.LinkedList;

public class WeightedTotalStrategy implements GradingStrategy {
	
	Double weight;
	//Constructor
	public WeightedTotalStrategy() {
		weight = new Double(0.0);
	}
	public WeightedTotalStrategy() {
		
	}
	@Override
	public Grade calculate(String key, LinkedList<Grade> grading) throws SizeException {
		// TODO Auto-generated method stub
		return null;
	}

}
