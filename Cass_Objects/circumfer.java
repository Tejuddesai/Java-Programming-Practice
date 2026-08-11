abstract class circle
{
 float pi;
 circle()
 {
    pi=3.14f;
 }
 abstract void show();
}
class area extends circle
{
  void show()
  {
    System.out.println("value of pi is: "+pi);
  } 
}
class circumfer extends circle
{
  void show()
  {
    System.out.println("value is: "+pi);
  }
  public static void main (String[] args)
  {	
	circle c = new area();
	c.show();
	circle c1 = new circumfer();
	c1.show();
  }
}