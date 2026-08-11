interface abc{
 static void show()
 {
    System.out.println("I am show function");
 }
 default void display()
 {
    System.out.println("I am display function");
 }

}
public class InfApp implements abc 
{
public static void main (String[] arg)
{

  abc.show();
  
  InfApp a= new InfApp();
  a.display();
  
}
}
