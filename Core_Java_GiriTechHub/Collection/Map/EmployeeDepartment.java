//2.Nested Map – Employee Department
//Create a Map<String, Map<Integer, String>> where the outer key represents a department and the inner Map contains employee ID and employee name. Write a program to display all employees department-wise.


package Map;
import java.util.HashMap;
import java.util.Map;
public class EmployeeDepartment {

	public static void main(String[] args)
	{
		 Map<String, Map<Integer,String>> map = new HashMap<>();

		 Map<Integer,String> developer = new HashMap<>();
		 developer.put(101,"priya");
		 developer.put(102,"siya");
		 developer.put(103,"salma");
		 developer.put(104, "shantanu");
		 developer.put(105, "soyra");

		 map.put("Software Development", developer);

		 Map<Integer,String> tester = new HashMap<>();
		 tester.put(201, "rrr");
		 tester.put(202, "yyy");
		 tester.put(203, "uuu");
		 tester.put(204, "kkk");

		 map.put("Testing", tester);

		 Map<Integer,String> Support = new HashMap<>();
		 Support.put(201, "ryi");
		 Support.put(202, "yjk");
		 Support.put(203, "upu");
		 Support.put(204, "kuu");

		 map.put("IT Support", Support);

		 for(Map.Entry<String,Map<Integer,String>> entry : map.entrySet())
		 {
			 System.out.println(entry.getKey());
			 System.out.println(entry.getValue());
		 }





	}

}
