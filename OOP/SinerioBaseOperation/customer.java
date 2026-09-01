//1.	A customer can pay using Credit Card, UPI, or Net Banking. How would you design this using OOP?


import java.util.*;

abstract class payment 
{
   abstract void paymentmode();
}   

 class credit extends payment
{
   void paymentmode()
   {
     System.out.println("Pay on credit card");
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the card NO:");
	 int card = sc.nextInt();
	 System.out.println("Enter cvv No:");
	 int cvv = sc.nextInt();
	 System.out.println("Paylment is procid");
   }

}
 class UPI extends payment 
 {
   void paymentmode()
   {
      System.out.println("Pay on UPI");
   }
 
 }
 
 class NetBanking extends payment{
 
   void paymentmode ()
   {
      System.out.println("Pay on NetBanking");
   }
 }
 public class customer
 {
    public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Select Payment mode");
	   System.out.println("1.pay on credit card");
	   System.out.println("1.pay on UPI");
	   System.out.println("1.pay on NetBanking");
	   int choose = sc.nextInt();
	   
	   switch(choose)
	   {
	      case 1:
		     payment p = new credit();
			 p.paymentmode();
		  break;
		  
		  case 2:
		     payment p1 = new UPI();
			 p1.paymentmode();
		  break;

          case 3:
             payment p2 = new NetBanking();
             p2.paymentmode();
           break;

          default :
            System.out.println("This payment mode is not available");		  
	   }
	   
	}
 }