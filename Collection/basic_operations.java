package basic_operation;

import java.util.ArrayList;
import java.util.List;


public class basic_operations
{



	public static void main(String[] args)
	{
		//List - List is ordered Collection and allow duplicates eg. linkedList , ArrayList


		List<String> students= new ArrayList<>();
	    students.add("Teju");
	    students.add("oju");
	    students.add("Kiran");
	    students.add("kiran");
	    students.remove("Kiran");

	    for(String s : students)   //iterable
	    {
	    	System.out.println(s);
	    }

	    //Set - Set is an Unordered collection and duplicates are not allow eg Hashset, Treeset




	}
}