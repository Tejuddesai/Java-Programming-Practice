//6.An employee management system has Permanent, Contract, and Intern employees.
//How would you implement salary calculation
//Permanent employee → Basic salary + Allowances + Bonus
//Contract employee → Hours worked × Hourly rate
//Intern → Fixed stipend
package Inheritance;

import java.util.*;

class calSalary {
	
	public double PermanentempSla(int basSal,int allowance,int bonus )
	{
		return basSal+allowance+bonus;
	}
	
	public double ContractEmp(int hours_work, int hourly_rate)
	{
		return hours_work * hourly_rate;
	}
	
	public double Intern(int stipend)
	{
		return stipend;
	}
}
public class Employee extends calSalary{
	  
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Choose the employee");
	System.out.println("1.Permanent Employee");
	System.out.println("2.Contract employee");
	System.out.println("3.Intern");
	int choose = sc.nextInt();

	
	
	switch(choose)
	{
	case 1:
		calSalary s = new calSalary();
		
		double sal1 = s.PermanentempSla(20000,2000,5000);
	    System.out.println("Permanent Employee salary is " + sal1);
		break;
	case 2:
		calSalary s1 = new calSalary();
		double sal2 = s1.ContractEmp(1,200);
		System.out.println("Contract employee salary is calculate hourly : " + sal2);
		break;
	case 3:
		calSalary s3 = new calSalary();
	    double sal = s3.Intern(5000);
	    System.out.println("Inter Stipend is " + sal);
		break;
	default:
		System.out.println("Invalid choise");
		break;
	}
 }
}

