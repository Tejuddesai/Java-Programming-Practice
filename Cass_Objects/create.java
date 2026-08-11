class demo
{


 void show()
 {
   System.out.println("Hello");
 }
}
class create extends demo
{

  void display()
  {
      System.out.println("Teju");
  }
  public static void main(String[] arg)
  {
     demo d = new create();
	 d.show();
	 create c = new create();
	 c.display();
  }
}