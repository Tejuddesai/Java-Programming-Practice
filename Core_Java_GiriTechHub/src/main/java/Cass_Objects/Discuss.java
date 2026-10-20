package Cass_Objects;
class Ram{

 void carr()
 {
  System.out.println("are you intrested in It field");
 }
}
class sham extends Ram 
{
	
  void carr()
  {
   System.out.println("Yes, I am Intrested");
  }
  
  public static void main(String[] args)
   {
     sham s= new sham();
	 s.carr();
   }
}
