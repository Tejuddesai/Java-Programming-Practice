
//5.	Sort Employees Using Comparable
//Create an Employee class with:
//6.	id
//7.	name
//salary
//Implement Comparable<Employee> and sort employees
//based on salary in ascending order.

package Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class employee implements Comparable<employee> {
	int id;
	String name;
	int salary;

	employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override

	public int compareTo(employee e) {
		return e.salary - this.salary;
	}

	@Override
	public String toString() {
		return id+ " " +name + " " + salary;
	}
}

public class SortEmployees {
	public static void main(String[] args) {
		List<employee> list = new ArrayList<>();
		list.add(new employee(1, "ojas", 50000));
		list.add(new employee(2, "priya", 45000));
		list.add(new employee(3, "sara", 2000));
		list.add(new employee(4, "riya", 7000));
		list.add(new employee(5, "kiya", 20000));

		Collections.sort(list);

		for(Object obj:list)
		{
			System.out.println(obj);
		}

	}

}
