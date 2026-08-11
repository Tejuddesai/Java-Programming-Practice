interface a
{
  int n,b;
  
  a(int n , int b)
  {
     this.n=n=10;
	this.b= b=5;
  }
  
  static void show()
  {
    System.out.println("Number is: "+n);
  }
}
class add implements a
{
   public void show()
   {
     Syste.out.println("Addition of two numbers a and b is: "+ (n+b));
   }
    public static void main(String[] args)
	{
	   a.show();
	   add a1= new add();
	   a1.show();
	}
}