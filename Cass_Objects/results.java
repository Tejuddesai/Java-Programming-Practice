class demo{

void add()
{
 System.out.println("parent");
}
// void add(int a, int b, int c)
// {
 // System.out.println(a+b+c);
// }
// public static void main(String[] arg)
// {
  // demo d= new demo();
  // d.add(6,4);
  // d.add(5,4,1);
// }
}
class results extends demo{
	
	void add( )
	{
		super.add();
		System.out.println("child");
	}
	public static void main(String[] arg)
	{
		 demo d = new results();
		 d.add();
		 
	}
}