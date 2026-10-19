//7.Sort Employees Using Comparator
//Create an Employee class and use Comparator to sort
//employees based on name alphabetically,
//without modifying the Employee class.

package Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class employees {

	String name;
	int salary;

	employees(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + " " + salary;
	}

}

class SortByName1 implements Comparator<employees> {


	@Override
	public int compare(employees e1, employees e2) {
		return e1.name.compareTo(e2.name);
	}

}

public class useComparatorSortEmployee {
	public static void main(String[] args) {

	List<employees> li = new ArrayList<>();
	li.add(new employees("teju",25000));
	li.add(new employees("oju",90000));
	li.add(new employees("pryu",8000));
	li.add(new employees("siya",9000));

	for(Object obj : li)
	{
		System.out.println(obj);
	}
	Comparator <employees> e = new SortByName1();
	Collections.sort(li,e);
	System.out.println("list is sorted by Alphabetically");

	for(Object obj: li)
	{
		System.out.println(obj);
	}

	}
}
