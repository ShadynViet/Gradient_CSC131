/*
 *Author: Ly Nguyen
 *Updated: 09/21/2018
 *			-Created Class.
 */

import java.util.*;


public class WeightedTotalStrategy implements GradingStrategy {
	
	Map<String, Double> weight;
	//Constructor
	public WeightedTotalStrategy() {
		weight = null;
	}
	public WeightedTotalStrategy(Map<String, Double> weightGiven) {
		weight = weightGiven;
	}
	//Calculate Weighted Total of Listed Grades
	public Grade calculate(String givenKey, LinkedList<Grade> grading) throws SizeException {
		@SuppressWarnings("unused")
		double localWeight = 0.0;
		double average = 0.0; 
		
		Set<String> weightSet = weight.keySet();
		//Security Check
		if (weight.equals(null)) {
			throw new SizeException("Map of weights given is null");
		} else if(weight.isEmpty()) {
			throw new SizeException("map of wieghts is empty. Size = 0");
		}else {
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
				}
				//Begin Calculating Total(Grade Value * weight)
				average += grading.get(i).getValue() * localWeight;
			}
			Grade gradedTotal = new Grade(givenKey,average);
			return gradedTotal;
		}
		
	}

}
