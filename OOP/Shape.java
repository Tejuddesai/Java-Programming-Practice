//Write a Java program using an Abstract class. Create an abstract class 
//Shape with an abstract method area(), and implement it in a Circle class. 

abstract class Shapetest {

	abstract void area();
}

class circle extends Shapetest
{
	int r=20;
	void area()
	{
		System.out.println("Ara of circle is : "+ 3.14*r*r);
	}	
}

public class Shape{
	
	public static void main(String[] args)
	{
		circle c = new circle();
		c.area();
	}
}