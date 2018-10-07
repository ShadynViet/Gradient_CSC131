package grading;
/*
 *Author: Ly Nguyen
 *Updated: 09/21/2018
 *			-Created Class.
 *		   10/06/2018
 *			-Revised Math for Weighted Total Strategy
 */

import java.util.*;


public class WeightedTotalStrategy implements GradingStrategy {
	
	Map<String, Double> weight;
	//Constructor
	public WeightedTotalStrategy() {
		weight = new HashMap<String,Double>();
	}
	public WeightedTotalStrategy(Map<String, Double> weightGiven) {
		weight = weightGiven;
	}
	//Calculate Weighted Total of Listed Grades. Each grade will have its own key to match Weight Map
	public Grade calculate(String givenKey, List<Grade> grading) throws SizeException {
		@SuppressWarnings("unused")
		double localWeight = 0.0;
		double average = 0.0; 
		
		//Security Check
		if (grading.equals(null)) {
			System.out.println("Size Exception on WeightedTotalStrat");
			throw new SizeException("WeightedTotal: List of Grade given is null");
			
		} else if(grading.isEmpty()) {
			System.out.println("Size Exception on WeightedTotalStrat");
			throw new SizeException("WeightedTotal: List of grade is empty. Size = 0");
		}
		for(int i=0 ;i < grading.size(); i++) {
			//if user's key exist in weight map, use key's weight accordingly.
			if (weight.containsKey(grading.get(i).getKey())) {
				localWeight = weight.get(grading.get(i).getKey());
				if (localWeight < 0.0) 
				{
					localWeight = 0;
				}
			}
			//No weight = assume 1.0// assumes Null is accounted
			else  {		
				localWeight = 1.0; 
				//find a way to use missing class to obtain Missing value
				
			}
			//Begin Calculating Total(Grade Value * weight)
			if (grading.get(i).getValue() == 0.0) {
				average += Missing.doubleValue(grading.get(i).getValue()); 
			} else {
				average += grading.get(i).getValue() * localWeight;
			}
		}
		Grade gradedTotal = new Grade(givenKey,average);
		return gradedTotal;
	
		
	}

}
