//2.	In a food delivery app, different restaurants calculate delivery charges differently. How would you implement this?  abstraction + Runtiem Polymorphism


import java.util.*;

abstract class foodDelivery
{
   abstract void deliveryCharges();
}

class MacD extends foodDelivery 
{
	
	void deliveryCharges()
	{
		System.out.println("** Welcome to MacD **");
		
		Scanner sc = new Scanner (System.in);
        System.out.print("Enter distance from KM : ");
		int distance = sc.nextInt();
		int charges = distance * 20;
		
		System.out.println("Delivery Charges is :" + charges +"rs");
	}
	
}

class Jimins extends foodDelivery 
{
	void deliveryCharges()
	{
		System.out.println("** Welcome to Jimins **");
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter distance from KM : ");
		int distance = sc.nextInt();
		int charges = distance * 10;
		
		System.out.println("Delivery Charges is :" + charges +"rs");
	}
}

class Zomato extends foodDelivery 
{
	
	void deliveryCharges()
	{
		System.out.println("** Welcome to Zomato **");
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter distance from KM : ");
		int distance = sc.nextInt();
		int charges = distance * 30;
		
		System.out.println("Delivery Charges is :" + charges +"rs");
	}
}

class OneByte extends foodDelivery
{
	void deliveryCharges()
	{
		System.out.println("** Welcome to OneByte **");
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter distance from KM : ");
		int distance = sc.nextInt();
		int charges = distance * 40;
		
		System.out.println("Delivery Charges is :" + charges +"rs");
	}
}

class KFC extends foodDelivery 
{
	void deliveryCharges()
	{
		System.out.println("** Welcome to KFC **");
		
		Scanner sc = new Scanner (System.in);
	    System.out.print("Enter distance from KM : ");
		int distance = sc.nextInt();
		int charges = distance * 50;
		
		System.out.println("Delivery Charges is :" + charges +"rs");
	}
}


public class restaurants 
{
   public static void main(String [] args)
   {
     Scanner sc = new Scanner(System.in);
	 System.out.println("\n-----** Select Restorant **-----\n");
	 System.out.println("1.MacD");
	 System.out.println("2.Jimins");
	 System.out.println("3.Zomato");
	 System.out.println("4.OneByte");
	 System.out.println("5.KFC ");
	 System.out.print("\nEnter Restorant number :" );
	 int choose = sc.nextInt();
	 System.out.println("\n");

	 switch(choose)
	 {
	 
		 case 1:
		 foodDelivery f = new MacD();
		 f.deliveryCharges();
		 break;
		 
		 
		 case 2:
		 foodDelivery f1 = new Jimins();
		 f1.deliveryCharges();
		 break;
		 
		 case 3:
		 foodDelivery f2 = new Zomato();
		 f2.deliveryCharges();
		 break;
		 
		 case 4:
		 foodDelivery f3 = new OneByte();
		 f3.deliveryCharges();
		 break;
		 
		 case 5:
		 foodDelivery f4 = new KFC();
		 f4.deliveryCharges();
		 break;
		 
		 default:
		   System.out.println("This restaurants is not Register");
		 break;
		   
	 }
	 
   }
}



