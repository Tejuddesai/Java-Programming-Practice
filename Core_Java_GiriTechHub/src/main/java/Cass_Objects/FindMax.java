 //Write program to create class name as FindMax with two functions
//void setArray(int a[]): this function is used for accept array as parameter
//int getMax(): this function can find the max value from array and return it.

class FindMax {
int arr[];

 void setArray(int a[])
 {
     arr=a;
 }
 
 int getMax()
 {
    int max =arr[0];
	for(int i = 1; i < arr.length; i++)
	{
	 if(arr[i] > max) 
	  
	  max = arr[i];
	}
	return max;
 }
 public static void main(String[] args)
 {
   int arr[]={10,20,30,40,90,80};
   
   FindMax f= new FindMax();
   f.setArray(arr);
   int max= f.getMax();
   System.out.println(max);
   
 }
 
}