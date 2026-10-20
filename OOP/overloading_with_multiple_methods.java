//. Write a Java program to illustrate method overloading with multiple methods sharing the same
//name but different parameter lists.
public class overloading_with_multiple_methods {

	
	static void add(int a, int b)
	{
		System.out.println("Addition is :" + a+b);
	
	}
	
	static void add(int a,int b, int c)
	{
		System.out.println("Addition is :" + a+b+c);
	}
	public static void main(String[] args)
	{
		add(10,20);
		add(10,20,30);
		
	}
}
