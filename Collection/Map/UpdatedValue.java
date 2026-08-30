
//Given a nested Map containing employee salaries department-wise,
//write a program to increase the salary of a particular employee by 10%.

package Map;

import java.util.HashMap;
import java.util.Map;

public class UpdatedValue {
	public static void main(String[] args)
	{


	Map<String,Map<String,Integer>> map = new HashMap<>();

	Map<String,Integer> dev = new HashMap<>();

	dev.put("ojas",20000);
	dev.put("priya",50000);
    map.put("Developer",dev);


	Map<String,Integer> tester = new HashMap<>();

	tester.put("siya",4000);
	tester.put("maya",2000);
	tester.put("sara",5000);
	map.put("Tester", tester);


	Map<String,Integer> support = new HashMap<>();
	support.put("soma",4000);
	support.put("mara", 6000);
	support.put("mira", 8000);

	map.put("Support",support);


	Map<String,Integer> employee = map.get("Tester");
	int salary = employee.get("maya");
	int incrSalary = salary *10/100;
	int NewSalary = salary + incrSalary;

	employee.put("maya", NewSalary);

	for(Map.Entry<String, Map<String,Integer>> entry : map.entrySet())
	{
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}

	}
}
