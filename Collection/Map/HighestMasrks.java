//3.Nested Map – Find Highest Marks
//Given:
//Map<String, Map<String, Integer>> studentData
//Find the student who has the highest marks in Mathematics.

package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;



public class HighestMasrks{
	public static void main(String[] args)
	{
		Map<String,Map<String,Integer>> map = new HashMap<>();
		Map<String,Integer> ojas = new HashMap<>();

		ojas.put("Maths",40);
		ojas.put("Science", 50);
		ojas.put("HIndi", 40);

		map.put("Ojas", ojas);

		Map<String,Integer> priya = new HashMap<>();
		priya.put("Maths",70);
		priya.put("Science",40);
		priya.put("Hindi", 40);

		map.put("Priyanka", priya);

		Map<String,Integer> teja = new HashMap<>();
		teja.put("Maths", 80);
		teja.put("Science", 50);
		teja.put("Hindia",40);

		map.put("Tejaswi",teja);

		Map<String, Integer> soya = new HashMap<>();
		soya.put("Maths",90);
		soya.put("science", 60);
		soya.put("Hindi",70);

		map.put("Soya",soya);

//		int max = Collections.max(maths);
//		int maxMarks = 0;
//		String topper ="";
//
//		for(Map.Entry<String,Map<String,Integer>> entry :map.entrySet())
//		{
//
//
//			int mathMarks = entry.getValue().get("Maths");  // get maths marks for each student
//
//			if(mathMarks > maxMarks)
//			{
//				maxMarks = mathMarks;
//				topper = entry.getKey();
//
//			}
//
//
//	}
//		System.out.println("Student Name is: " + topper);
//		System.out.println("Maths Marks: " + maxMarks);

	}
}
