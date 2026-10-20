//WAP to create Vector and store 5 values in it and fetch it using Iterator, ListIterator,
//Enumeration and enhance for loop?

package List.VectorPractice;
import java.util.*;
public class StoreValue {
	public static void main (String[] args)
	{
	Vector<String> v = new Vector<>();
	v.add("Teju");
	v.add("OJU");
	v.add("aadi");
	v.add("suhas");
	v.add("pratham");
	
//****************ITERATOR****************
	
//	Iterator<String> itr = v.iterator();
//	while(itr.hasNext())
//	{
//		System.out.println(itr.next());
//	}
	
//****************LISTITERATOR****************
	
//	ListIterator<String> itr = v.Listiterator();
//	while(itr.hasNext())
//	{
//		System.out.println(itr.next());
//	}
	
//****************ENHANCE FOR LOOP ****************	
	
	for(String s : v)
	{
		System.out.println(s);
	}
	
	}
}
