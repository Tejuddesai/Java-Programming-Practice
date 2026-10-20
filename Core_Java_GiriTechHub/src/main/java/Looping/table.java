
import java.util.*;
public class table{


public static void main(String[] arg)
{
	 Scanner sc= new Scanner(System.in);
	 int i,no,tab;
	 System.out.println("Enter Number: ");
	  no = sc.nextInt();
	 
	 i=1;
	 while(i<10)
	 {
		 tab=no*i;
		 System.out.println(no + " X " + i + "=" + tab );
		 i++;
	 }
}
}