import java.util.Iterator;
import java.util.List;
import java.util.Collections;

/*
 * Author: Ly Nguyen
 * Update: Created class implements filter 09-23-2018
 * 			
 * 
 * */
public class DropFilter implements Filter {
	
	boolean shouldDropLowest;
	boolean shouldDropHighest;
	
	//Default drops the lowest and highest elements Default is both are true;
	public DropFilter() {
		shouldDropLowest = true;
		shouldDropHighest = true;		
	}
	public DropFilter(boolean low,boolean hi) {
		shouldDropLowest = low;
		shouldDropHighest = hi;
	}
	
	@Override
	//Drops Lowest Value of list and/or Highest depending on booleans
	public List<Grade> apply(List<Grade> grading) throws SizeException {
		// TODO Auto-generated method stub
		List<Grade> aux = grading;
		
		//Security checking
		if (aux.size() == 0) {
			throw new SizeException("DropFilter: ListGrade size is = 0.");
		} else if(grading.equals(null)){
			throw new SizeException("DropFilter: ListGrade is null.");
			//If size of list is equal to size that will be dropped
		} else if (grading.size() == grading.size() - 2) {
			throw new SizeException("DropFilter: ListGrade will be same size after drop.");
			//If the list is not empty, begin applying grade
		} else {
			//Check booleans, drop if true.
			if (shouldDropHighest == true) {
				aux.remove(Collections.max(aux)); //SHOULD drop the Biggest value in the list.
			} 
			if(shouldDropLowest == true) {
				aux.remove(Collections.min(aux)); //SHOULD Drops the smallest value in list.
			}					
			//check if the size is less than original again.
			if (aux.size() < grading.size()) {
				return aux;
			}			
		}
		System.out.println();
		return null; //if its null. It will at least continue running the program.
	}
	
	

}
