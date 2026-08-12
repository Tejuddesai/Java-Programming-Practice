// write a program input the number and ceak number is preseent fibonaci serious or not 

import java.util.*;

public class CHFEB
{
	
	
	public static void main (String[] args)
	{
		
		 Scanner sc = new Scanner (System.in);
		 long f1=0, f2=1, fib ;
		 System.out.print("Enter the number: ");
		 int no = sc.nextInt();
		 boolean flag = false;
		 
		 while (fib<=no)   // fibonaci number ha output number peksha barka hava aahe 
		 {
			 // for(int i =1 ; i<=no; i++)
			 // {
				 // fib = f1+f2;
				 // f1=f2;
				 // f2= fib; 	
			 // }
			 fib = f1+f2;
				 f1=f2;
				 f2= fib;  
				 
	        if(no == fib)
			{ flag=true;
			break;
			}
			 
		 }
		 
		  if(flag)
			 {
				System.out.println("This number is Feabonicy Number " + no);
			 }
			 else
			 {
					 
				System.out.println("This number is not Feabonicy Number " + no);
			 }
	}

}