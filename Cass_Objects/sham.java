class Ram{
 // String n;

  void carr(String name)
 {
	  // n=name;
  System.out.println("are you intrested in It field :"+ name);
 }
}
class sham extends Ram 
{
 
  void carr( int n)
  {
   super.carr("Teju");
   System.out.println("Yes, I am Intrested :" + n);
  }
  
  public static void main(String[] args)
   {
	
     sham s= new sham();
	 s.carr(10);
   }
}
