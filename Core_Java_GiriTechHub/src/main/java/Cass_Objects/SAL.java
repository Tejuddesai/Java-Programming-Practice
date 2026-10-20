public class SAL
{ 

// string(char[])

 /* public static void main(String[] arg)
 {
    char ch[]= new char[]{'H','E','L','L','O',' ','T','E','J','U',' ','H','O','W',' ','A','R','E',' ','Y','O','U',};
	String s = new String(ch);
	System.out.println(s);
 } */
 
 // string(byte[])
 
 /* public static void main(String[] arg)
 {
	byte b[] = new byte[]{84,69,74,85}; 
    String s= new String(b); 
    System.out.println(s);	
 } */
 
 
 // string Length()
 
 
 public static void main(String[] arg)
 {
	 
	 
	 String s1= "Teju";
	 String s2= "teju";
	 
	int result = s1.compareToIgnoreCase(s2);
	 if(result == 0)
	 {
		 
		 System.out.println("string is same as s1  : " + s1 +  " \n result is : " + result);
		 
	 }
	 else
	 {
		
		 
		 System.out.println("string is not same as s1:  " + s2 +  " \n result is :  " + result );
	 }
/* 	 String s="TEJU";
	 // int len = s.length();
	 System.out.println(s);
	 char ch = s.charAt(0);
	 System.out.println(ch); */
	 
	/*  String s= "    JSpm    ";
	 int len = s.length();
	 // String s1 = s.toLowerCase();
	 String s5 = s.trim();
	 System.out.println(s5);
	 String s1 = s5.toUpperCase();
	 
	 System.out.println("Upper case is: " + s1);
	 
		System.out.println(len);
	 String j = s5.toLowerCase();
	 System.out.println("Lower case is: " + j); */
	 // for(int i=0; i < s1.length(); i++)
	 // {
		
		// System.out.println(s1.charAt(i) + " ====>" + i);
       		
	 // }
	 
 }
}