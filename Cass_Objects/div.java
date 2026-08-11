/* /* Write a program to crate class name as Value with single function name as setValue(int,int) and
we have to create three child classes name as Add with function int getAdd(), Mul with function
getMul() and Div with function getDiv() and getAdd() function return addition of two value which is
inherited from Value class , getMul() function return multiplication of two values which is inherited
from Value class and gitDiv() function return division of two values which Is inherited from Value
class  */


class Value{
 int a,b;
 void setValue(int a,int b)
 {
   this.a= a;
   this.b= b;
 }
}
class Add  extends Value {
int getAdd()
{
  System.out.println("Addition of A and B is:" + (a+b));
  return a+b;
}
}

class Mul extends Value {
 int getMul()
 {
 
    System.out.println("Multiplication of A and B is:" + (a*b));
	return a*b;
 }
}

 class Div extends Value
{
  int getDiv()
  {
    System.out.println("Division of A and B is:" + (a/b));
	return a/b;
  }
  
  public static void main (String [] args)
  {
   Div d = new Div();
   d.setValue(10,2);
   d.getDiv();
   
   Add a = new Add();
   a.setValue(10,20);
   a.getAdd();
   
   Mul m = new Mul();
   m.setValue(10,20);
   m.getMul();
   
  }
} 