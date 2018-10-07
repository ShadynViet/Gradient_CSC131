package grading;
import java.util.List;
/*
 * Author: Ly Nguyen
 * 		Class Created: September 22,2018
 * 
 *		Note: 
 *			10/6- Revise Calculation for TotalStrategy
 */


public class TotalStrategy extends WeightedTotalStrategy{
	public Grade calculate(String givenKey, List<Grade> grading) throws SizeException {
		@SuppressWarnings("unused")
		double localWeight = 1.0;			//No Weight Assume 1.0
		double total = 0.0; 
/*		
		//Security Check
		if (super.weight.equals(null)) {
			throw new SizeException("Map of weights given is null");
		} else if(super.weight.isEmpty()) {
			throw new SizeException("map of wieghts is empty. Size = 0");
		}else {

			for(int i=0 ;i < grading.size(); i++) {
				//if user's key exist in weight map, use key's weight accordingly.
				if (super.weight.containsKey(grading.get(i).getKey())) {
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
			*/
	//Calculate TotalStrategy with no weights
	for (Grade i: grading) {
		if(i == null || i.getValue() == 0.0) {
			total = total + Missing.doubleValue(0.0);
		}
		total = total + i.getValue(); 
	}
		Grade gradedTotal = new Grade(givenKey,total);
		return gradedTotal;
	}		
	//}
}
