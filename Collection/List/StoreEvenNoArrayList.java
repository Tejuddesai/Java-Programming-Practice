//Q1.Question Statement
//Write a Java program to accept an integer array from the user, 
//store only even numbers into an ArrayList, and display the elements.
//Description
//Read array elements
//Check each number
//Store even numbers in ArrayList
//Input
//Array: 1 2 3 4 5 6
//Output
//Even Numbers: [2, 4, 6]
package List;

import java.util.*;

public class StoreEvenNoArrayList {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Array is :" + Arrays.toString(array));
		for (int num : array) 
		{
			if (num % 2 == 0) 
			{
				list.add(num);
			}
		}
		System.out.println("Even Number of Array is :" + list);

	}

}
