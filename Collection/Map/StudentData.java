//Create a Map<String, Map<String, Integer>> where the
//outer key is the student name and the
//inner Map contains subject names and marks. Write a program to:
//1.Add 3 students.
//2.Add marks for 3 subjects.
//3.Display each student's marks.

package Map;

import java.util.HashMap;
import java.util.Map;

public class StudentData {

	public static void main(String[] args) {
		Map<String, Map<String, Integer>> map = new HashMap<>();

		Map<String, Integer> ojaswi = new HashMap<>();

		ojaswi.put("java", 30);
		ojaswi.put("SpringBoot", 40);
		ojaswi.put("react", 20);

		map.put("Ojaswi", ojaswi);

		Map<String, Integer> tejaswi = new HashMap<>();
		tejaswi.put("java", 40);
		tejaswi.put("SpringBoot", 50);
		tejaswi.put("react", 30);

		map.put("Tejaswi", tejaswi);

		Map<String, Integer> mauli = new HashMap<>();
		mauli.put("java", 50);
		mauli.put("SpringBoot", 60);
		mauli.put("react", 20);

		map.put("Mauli", mauli);

		for (Map.Entry<String, Map<String, Integer>> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}

}
