// Write a Java program to demonstrate Inheritance using the extends keyword. 
// Create a Parent class with a method display() and a Child class 
// that inherits and calls the method

package Inheritance;
class stddata 
{

void display ()
{
	System.out.println("Student name is Teju");
}
}
public class parentChild extends stddata
{
	public static void main(String[] args)
	{
		parentChild s = new parentChild();
		s.display();
	}
}
