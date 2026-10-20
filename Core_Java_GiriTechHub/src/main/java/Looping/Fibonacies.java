import java.util.*;

public class Fibonacies {
	
	public static void main (String[] arg)
	{
		  Scanner sc = new Scanner (System.in);
		  System.out.print("Enter the Range :");
		  int no = sc.nextInt();
		  int f1= 0, f2= 1, fib , i=1;
		  
		  while (i <= no )
		  {
			  fib = f1 + f2;   //  0+1=1     
			  f1 = f2;         //  0= 1
			  f2= fib;         //  1= 1
			  i ++;           // 2 
			   System.out.print( " " + fib  + " ");
	}
			  
		  }
		  
		 
}
