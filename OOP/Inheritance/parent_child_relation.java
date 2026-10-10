//Write a Java program to demonstrate the use of the super keyword. 
//Create a parent class with a variable and method, 
//and access both from the child class using super.

package Inheritance;

class parent {
	
	String name = "dinkar";
	void display()
	{
		System.out.println ("Parent name is : " + name );
	}
	
}

class child extends parent {
	
	String name = "Teju";
	void child ()
	{
		super.display();
		System.out.println ("child name is :" + name);
		
	}
	
}

public class parent_child_relation {
	
	public static void main(String[] args)
	{
		child c = new child();
		c.child();	
	}
}





