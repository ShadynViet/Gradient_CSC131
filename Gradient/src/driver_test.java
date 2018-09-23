import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class driver_test {

		public static void main(String[] args) throws SizeException {
			Grade first = new Grade("");
			Grade second =  new Grade("abbcc", 100.00);	
			Grade third = new Grade("aaaaa",70.00);
			Grade fourth = new Grade("abbbb", 80.00);
			System.out.println(second.compareTo(first));
			
			//Test weighted total strat
			Map<String, Double> weightSet = new HashMap<String,Double>();
			weightSet.put("11111", 1.0);
			weightSet.put("22222", 1.5);
			weightSet.put("33333", 1.0);
			weightSet.put("44444", -0.1);
			weightSet.put("55555", 0.0);
			WeightedTotalStrategy wts = new WeightedTotalStrategy(weightSet);
			
			LinkedList<Grade> gradeList = new LinkedList<Grade>();
			gradeList.add(first);
			gradeList.add(second);
			gradeList.add(third);
			gradeList.add(fourth);
					
			Grade total = new Grade("");
			total = wts.calculate("aaaaa", gradeList);
			System.out.println(total.toString());
			
			
		}
	
}
