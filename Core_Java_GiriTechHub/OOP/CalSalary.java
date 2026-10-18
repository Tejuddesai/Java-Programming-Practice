//6.An employee management system has Permanent, Contract, and Intern employees.
//How would you implement salary calculation
//Permanent employee → Basic salary + Allowances + Bonus
//Contract employee → Hours worked × Hourly rate
//Intern → Fixed stipend


import java.util.*;

class Employees{
	
	public double salary()
	{
		return 0;
	}
}

class permentEmp extends Employees
{
	public double salary(int sal,int allow,int bonus)
	{
		return sal+allow+bonus;
	}
	
}

class contractEmp extends Employees
{
	public double salary(int work_hr,int hour_rate)
	{
		return work_hr*hour_rate;
	}
}

class Intern extends Employees
{
	public double salary(int stipend)
	{
		return stipend;
	}
}
public class CalSalary {
	
	public static void main(String[] args)
	{
		permentEmp p = new permentEmp();
		System.out.println("Permenent Employee Salary is : " + p.salary(25000,2000,5000));
		
		contractEmp c = new contractEmp();
		System.out.println("Contract Employee Salary is :" + c.salary(1, 300) + "/hr");
		
		Intern I = new Intern();
		System.out.println("Intern Employee Salary is :" + I.salary(5000));
		
		
	}

}
