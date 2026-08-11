//Write program to create class name as CheckDuck with parameterized constructor
//CheckDuck(int no): this constructor can accept number as parameter
// Boolean isDuckNumber(): this function check if number is duck return true otherwise return false.

class CheckDuck {
	
	int no;
	 CheckDuck(int no)
	 {
		 this.no=no;
	 }
	boolean isDuckNumber ()
	{
		int temp = no;
		
		while( temp > no)
		{
			int rem = temp %10;
			if(rem == 0 )
			{
				return true;
			}
			temp = temp /10;
		}
		return false;
		
	}
	
	public static void main(String[] args)
	{
		 CheckDuck c = new CheckDuck(103);
		 boolean result = c.isDuckNumber();
		if(result)
		{
			System.out.println("Number is duck");
		}
		else
		{
			System.out.println("Number is Not duck");
		}
	}
}