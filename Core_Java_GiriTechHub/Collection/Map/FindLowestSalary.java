//Question
//Create an employee Map and find the employee with the lowest salary.
//Explanation
//Compare every salary with the current minimum value while iterating through the Map.


package Map;
import java.util.*;
public class FindLowestSalary {

	public static void main(String[] args)
	{
		Map<String,Integer> map = new HashMap<>();
		map.put("Anali",15000);
		map.put("Komal",20000);
		map.put("Hans",25000);
		map.put("Tapu", 30000);
		map.put("Tarak", 40000);
		
		int min = Integer.MAX_VALUE;
		String employee = "";

		for (Map.Entry<String, Integer> entry : map.entrySet()) {

		    if (entry.getValue() < min) {
		        min = entry.getValue();
		        employee = entry.getKey();
		    }
		}

		System.out.println("Lowest Salary is : " + min);
		System.out.println("Employee is : " + employee);
		
		
	}
}
