public class wrapper
{
   public static void main(String[] arg)
   {
     int a=100 ;
	 String s = "90";
	 
	  String s1 = String.valueOf(a);
	  System.out.println(s1);
	  Float f= Float.valueOf(a);
	  System.out.println("Floating value is: "+f);
	  Integer i = Integer.valueOf(s);
	  System.out.println("Convert String to Integer is :"+ i);
	  
	  
	  
   }

}