// write a program input the number and ceak number is preseent fibonaci serious or not 
// fibonaci series manje = 2 number chi addition equal to third number in series 
import java.util.*;
public class FEB
{
	
public static void main (String[] args)
{
	
	Scanner sc = new Scanner(System.in);       
	int f1=1, f2=0, fib,i=1;
	System.out.print("Enter range : ");
	int limit = sc.nextInt();
	
	while(i<=limit)
	{
		fib=f1+f2;
		f1=f2;
		f2=fib;
		i++;
		System.out.print(" " + fib + " " );
	}
	
}

}