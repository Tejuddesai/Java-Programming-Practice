
//Create a Map containing employee names and salaries.
//Display all employees whose salary is greater than 50,000.
//Explanation
//Iterate through entrySet() and apply a condition on the Map value.

package Map;
import java.util.*;
public class EmployeeSalaryStore {

	public static void main(String[] args)
	{
		Map<String,Integer> map = new HashMap<>();
		map.put("Sarata",30000);
		map.put("Priya", 60000);
		map.put("Teju", 80000);
		map.put("Hira", 20000);
		map.put("swara",50000);
		map.put("veda", 85000);
		
		for(Map.Entry<String,Integer> entry : map.entrySet())
		{
			if(entry.getValue()>=50000)
			{
				System.out.println(entry);
			}
			
		}
		
		
		
	}
}
