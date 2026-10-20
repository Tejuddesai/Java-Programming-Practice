
import java.util.*;
public class factorialNo
{

 public static void main(String[] arg)
 {
     Scanner sc = new Scanner(System.in);
	 int no,f=1;
	 System.out.println("Enter Number");
	 no= sc.nextInt();
	 
	 while(no!=0)
	 {
	    f=f*no ; //1*5 = 5 {f=5}
		         //5*4 = 20 {f=20} 
                 //20*3 = 60 	
				 // 60*2 = 120 
				 // 120*1 = 120
	// --------------------------------  
		no--;    // 5-1= 4
		         // 4-1 = 3
				 // 3-1= 2
				 // 2-1=1
				 // 1-1 = 0 condition is false (no = 0) loop stop 
	 }
	 System.out.println("Factorial is: " + f);  // print this statement 
 }
  
}