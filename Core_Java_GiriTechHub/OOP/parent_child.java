
//Write a Java program to demonstrate Method Overriding where a child class 
//provides its own implementation of a method defined in the parent class. 

class child
{
	public void childinfo()
	{
		System.out.println("this child are 24 year old");
	}
}

class parent extends child
{
	public void childinfo()
	{
		System.out.println("this child are 25 years old");
	}
}

public class parent_child extends parent {
	
	public static void main(String[] args)
	{
		parent_child c = new parent_child();
		c.childinfo();
		
	}
	

}
