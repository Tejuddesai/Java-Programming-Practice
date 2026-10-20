
//Write a Java program that accepts two integers from the user and performs division. Handle
//InputMismatchException, ArithmeticException, and other unexpected exceptions using separate catch
//blocks. Use a finally block to print "Execution Completed". Demonstrate the execution order when invalid
//input or division by zero occurs

import java.util.*;

public class exception_program {

	int a=10;
	int b=20;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	try {
		
		System.out.println("Enter the first number :");
		int a = sc.nextInt();
		
		System.out.println("Enter the Second number :");
		int b = sc.nextInt();
		
		System.out.println("Division is :" + a/b);
	     
	}
	catch(InputMismatchException i)
	{
		System.out.println("Enter Integer number only!");
	}
	
	catch(ArithmeticException a)
	{
		System.out.println("Avoid Zero");
	}
	catch(Exception e)
	{
		System.out.println("UnExpected Exception Occurs");
	}
	finally
	{
		System.out.println("Execution Completed");
	}
	
	}
	     
}
	
	









