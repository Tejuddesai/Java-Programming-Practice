import java.util.*;

public class factorial 
{
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int no,f =1;
		System.out.print("\n Enter the number: " );
		no = sc.nextInt();
		
	while(no!=0)
		{
			f = no * f;
			no--;
			
		}
		
		System.out.println("\n Factorila is : " + f);
		
	}
	
	
}