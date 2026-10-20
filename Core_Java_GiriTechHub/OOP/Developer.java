//Write a Java program to demonstrate Abstraction using an abstract class Employee with an
//abstract method calculateSalary(), and implement it in a Developer class.

abstract class  Employee{

	abstract void calSalary(int baseSal, int allowance, int bonus);
}
class sal extends Employee 
{
	 
	 void calSalary(int baseSal, int allowance, int bonus)
	 {
		  int salary = baseSal+allowance+bonus;
		  System.out.println("Employee Salary is : " + salary);
	 }	
}
public class Developer
{
	public static void main(String[] args)
	{
		sal s = new sal();
		s.calSalary(20000,2000,5000);
	}
}
