
//8.	Sort Students Using Comparable
//Create a Student class with:
//9.	rollNo
//10.	name
//percentage
//Implement Comparable<Student> to sort students
//based on percentage in descending order.


package Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class student implements Comparable<student>
{
	int rollNO;
	String name;
	int percentage;

	student(int rollNo,String name, int percentage)
	{
		this.rollNO=rollNo;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public int compareTo(student s)
	{
		return  this.percentage - s.percentage;
	}

	@Override
	public String toString()
	{
		return rollNO+ "" + name + "" + percentage;
	}
}
public class SortStudent {
	public static void main(String[] args)
	{
		List<student> list = new ArrayList<>();
		list.add(new student(11 ," uuu ",90));
		list.add(new student(12 ," ttt ",45));
		list.add(new student(13 ," pp ",89));
		list.add(new student(14 ," oo ",65));

		Collections.sort(list);

		for(student s : list)
		{
			System.out.println(s);
		}

	}


}
