//Write program to create class name as Factorial with two functions
//void setValue(int x): this function accept number as parameter
//int getFactorial(): this function can calculate factorial of number and return it.

class factorial{
	
	int no;
	void setValue(int x)
	{
	   no=x;
	}
	int getFactorial()
	{
		int fact=1;
		for(int i=1; i<=no; i++)
		{
			fact= fact *i;
		}
		return fact;
		
	}
	
	public static void main(String[] args)
	{
		factorial f= new factorial();
		f.setValue(5);
		int fact = f.getFactorial();
		System.out.println(fact);
		
	}
}