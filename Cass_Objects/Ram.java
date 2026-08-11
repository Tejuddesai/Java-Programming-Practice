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
}
class Discuss extends sham
{
   public static void main(String[] args)
   {
     Discuss s= new Discuss();
	 s.carr();
   }
}