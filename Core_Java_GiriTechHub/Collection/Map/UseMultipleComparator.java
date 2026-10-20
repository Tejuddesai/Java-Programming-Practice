//8.Multiple Comparators
//Create an Employee11 class containing id, name, age, and salary.
//Write separate Comparators to sort employees by:
//o	Salary
//o	Age
//o	Name

package Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee1 {

    int id;
	String name;
	int age;
	int Salary;

	Employee1(int id, String name, int age,int Salary)
	{
		this.id = id;
		this.name = name;
		this.age= age;
		this.Salary = Salary;
	}

	@Override
	public String toString()
	{
		return 
			"ID : " + id  + " " +
			", Name : "+ name + " " + 
			", Age : " + age + " " +
			", Salary : "+ Salary ;
	}

}

class sortBySalary implements Comparator<Employee1>
{
	@Override
	public int compare(Employee1 e1 , Employee1 e2)
	{
		return e1.Salary - e2.Salary;
	}

}

class sortByAge implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 e1, Employee1 e2)
	{
		return e1.age - e2.age;
	}

}

class sortByName implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 e1, Employee1 e2)
	{
		return e1.name.compareTo(e2.name);
	}

}


public class UseMultipleComparator {
	public static void main(String[] args)
	{
		List<Employee1> list = new ArrayList<>();
		list.add(new Employee1(101,"Teju",25 ,25000));
		list.add(new Employee1(102,"Oju",20,20000));
		list.add(new Employee1(103,"praju",30,30000));
		list.add(new Employee1(104,"kaju",35,35000));
		list.add(new Employee1(105,"Raju",40,40000));

		for(Employee1 e: list)
		{
			System.out.println(e);
		}

		Comparator <Employee1> s = new sortBySalary();
		Collections.sort(list,s);

		System.out.println("********* List sort by his Salary *********");
		for(Employee1 e: list)
		{
			System.out.println(e);
		}

		Comparator<Employee1> a = new sortByAge();
		Collections.sort(list,a);
		System.out.println(" ********* List sort by his Age *********");
		for(Employee1 e: list)
		{
			System.out.println(e);
		}

		Comparator<Employee1> n = new sortByName();
		Collections.sort(list,n);
		System.out.println(" ********* List sort by his Name *********");
		for(Employee1 e:list)
		{
			System.out.println(e);
		}


	}

}
