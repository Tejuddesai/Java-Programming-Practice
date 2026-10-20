abstract class demo
{
   abstract void show();

} 
class test{
 public static void main(String[] args)
 {
  demo d = new demo()
  {
       void show()
	   {
	   System.out.println("hello i am anonymous class");
	   }	   
  };
  d.show();
}
}