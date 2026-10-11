//Write a Java program to demonstrate Multiple Inheritance using Interfaces. 
//Create two interfaces Printable and Showable and implement both in a single class.

interface printable
{
	void print();
}
interface showable 
{
	void show();
}

class test implements printable,showable
{
	
	public void show()
	{
		System.out.println("Show the data");
	}
	public void print()
	{
		System.out.println("Print the data");
	}
}
public class print_show {
	
	public static void main (String[] args)
	{
		test t = new test();
		t.show();
		t.print();
	}
}
