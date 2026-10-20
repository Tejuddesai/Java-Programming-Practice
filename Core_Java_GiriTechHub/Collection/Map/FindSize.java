

//Create a Map of country and capital names. 
//Check whether a particular country exists in the Map.
//Explanation
//Use containsKey() to check whether the given country is available.

package Map;
import java.util.*;
public class FindSize {
	
	public static void main(String[] args)
	{
		Map<String,Integer> map = new HashMap<>();
		map.put("Teju",1200);
		map.put("Oju", 1500);
		map.put("siya", 14000);
		map.put("NILU", 25000);
		map.put("Maya", 30000);
		
		for(Map.Entry<String,Integer> entry : map.entrySet())
		{
			System.out.println(entry);
		}
		System.out.println("Size of Map is : " + map.size());
	}

}
