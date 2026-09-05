//3.	A company wants different login roles like Admin, Student, and Trainer. How would you design it?


import java.util.*;

abstract class  compLogin
{
	abstract void empLogin();	
}

class Admin extends compLogin 
{
	 void empLogin()
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n********Welcome to Admin Login*******\n");
		System.out.print("Enter Admin Id :");
		Long adminId  = sc.nextLong();
		System.out.print("Enter Admin Password : ");
		Long adminPw  = sc.nextLong();
		System.out.println("\n****** Welcome to Admin Portal ******");
	 }
}

class Student extends compLogin
{
    void empLogin()
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("********Welcome to Student Login*******\n");
		System.out.print("Enter Student Id :");
		Long StudentId  = sc.nextLong();
		System.out.print("Enter Student Password :\n");
		Long StudentPw  = sc.nextLong();	
        System.out.println("****** Welcome to Student Portal ******");		
	}		
}

class Trainer extends compLogin
{
	void empLogin()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("********Welcome to Trainer Login*******\n");
		System.out.print("Enter Trainer Id :");
		Long TrainerId  = sc.nextLong();
		System.out.print("Enter Trainer Password :");
		Long TrainerPw  = sc.nextLong();
		System.out.println("\n****** Welcome to Trainer Portal ******");
	}
}

public class company {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n********Select Login Type ********\n");
		System.out.println("1. Admin ");
		System.out.println("2. Student ");
		System.out.println("3. Trainer \n");
		System.out.print("Enter Login Number :" );
		int choise  = sc.nextInt();
		
		
		switch(choise)
		{
			case 1:			
			  compLogin c = new Admin();
			  c.empLogin();			  
			  
			break;
			
			case 2:
				compLogin c1 = new Student();
				c1.empLogin();	
			break;

            case 3:
				compLogin c2 = new Trainer();
				c2.empLogin();	
            break;

            default:
                System.out.println("There is no choise");
            break;
						   
		}
	}
}