
//Create a HashMap to store student names and their marks. 
//Display all student names along with their marks.

package Map;
import java.util.*;
public class StudentDatauseHashmap {
	public static void main(String[] args)
	{
		Map<String,Integer> map = new HashMap<>();
		map.put("Teju", 130);
		map.put("OJU", 120);
		map.put("siya", 150);
		map.put("sra", 100);
		
		
		for(Map.Entry<String,Integer> e: map.entrySet())
		{
			System.out.println(e);
			
			
		}
		
		System.out.println( "Siyas marks is : " +map.get("siya"));
	}

}
