class {
int x,y;
A(int a, int b)
{
 x=a;
 y=b;
 System.out.println("Addition of x and y is:" + (x+y));
}
}
class  B extends A {
  B()
  {
    Supper(10,20);
	System.out.println("I am B constructtor");
  }
  public static void main(String[] args)
  {
    B b = new B(); 
  }

}