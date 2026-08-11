interface abc 
{
   static void show()
   {
   System.out.println("show method");
   }
   
   default void display()
   {
    System.out.println("Display method");
   }
}
public class infaApp implements abc 
{

  public static void main(String[] args)
  {
    abc.show();
	infaApp  app = new infaApp();
	app.display();
  }
}