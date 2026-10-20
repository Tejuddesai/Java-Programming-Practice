/* Write Program create class name as ArrSum with method void setValue(int arr[]) you have to
create child class name as GetSum with method int getArrSum() you have to accept array values
from ArrSum and calculate its sum and return it */


class ArrSum 
{
int a[];
void setValue(int arr[])
{
  this.a = arr;
}
}
class GetSum extends ArrSum
{
int getArrSum()
{
  int sum=0;
  for(int i=0; i< a.length; i++)
  {
   sum = sum + a[i];
  }
  
  return sum;
}
public static void main (String[] args)
{
     GetSum g = new GetSum();
	 int ar[] = {10,20};
	 g.setValue(ar);
	 int result = g.getArrSum();
	 System.out.println("Sum of Array is : " + result);
}
}