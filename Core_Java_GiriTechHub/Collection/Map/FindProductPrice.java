
//Create a Map containing product names and prices. Accept a product name and display its price.
//Explanation
//Use get() to retrieve the value associated with the product key.

package Map;
import java.util.*;
public class FindProductPrice {

	public static void main(String[] args)
	{
		Map<String,Integer> map = new HashMap<>();
		map.put("laptop", 80000);
		map.put("Mobile", 60000);
		map.put("Tablet", 50000);
		
		
		for(Map.Entry<String,Integer> entry : map.entrySet())
		{
			
			System.out.println(entry);
		}
		
		System.out.println("Price of Mobile is : " + map.get("Mobile"));
	}
}
