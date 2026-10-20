package Collections;

//WAP to create ArrayList and store find values in it perform following operation
//1. Find max value from ArrayList
//2. Find min value from ArrayList
//3. Reverse the ArrayList
//4. Swap values of 1 and 3 index in ArrayList
//5. Convert ArrayList as synchronized collectionpackage Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionsapp {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(50);
		list.add(60);
		list.add(80);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(70);
		int max = Collections.max(list);
		System.out.println("Max Value of ArrayList is: \n " + max);
		int min = Collections.min(list);
		System.out.println("Min value of ArrayList is: \n" + min);
		Collections.reverse(list);
		System.out.println("Reverse list : \n" + list);
		Collections.swap(list, 1, 3);
		System.out.println("Swap values from 1th and 3th position:  \n" + list);
        Collections.sort(list);
        System.out.println("sorted data :" +list);

		List<Integer> synList = Collections.synchronizedList(list);
		System.out.println("Array List is Synchronized \n" + synList);

	}
}
