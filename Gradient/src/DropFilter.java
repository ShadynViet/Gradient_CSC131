import java.util.List;

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
		if (aux.size() == 0) {
			throw new SizeException("DropFilter: ListGrade size is = 0.");
		} else if(grading.equals(null)){
			throw new SizeException("DropFilter: ListGrade is null.");
			//If size of list is equal to size that will be dropped
		} else if (grading.size() == grading.size() - 2) {
			throw new SizeException("DropFilter: ListGrade will be same size after drop.");
			//If the list is not empty, begin applying grade
		} else if (!grading.isEmpty()) {
			
		}
		
		return null;
	}
	
	

}
