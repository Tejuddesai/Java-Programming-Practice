//Write a Java program to create a `Calculator` class with `add()`, `subtract()`, `multiply()`, and
//`divide()` methods.
public class Calculator {
	
	public int add(int a,int b)
	{
		return a+b;
	}

	public int sub(int a, int b)
	{
		return a-b;
	}
	
	public int mul(int a,int b)
	{
		return a*b;
	}
	
	public int div(int a,int b)
	{
		return a/2;
	}
	public static void main(String[] args)
	{
		Calculator c = new Calculator();
		System.out.println("Addition is: " + c.add(10,20));
		System.out.println(c.sub(20, 10));
		System.out.println(c.mul(10,5));
		System.out.println(c.div(10,5));
	}
	
}
