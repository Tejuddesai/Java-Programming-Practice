//Q1. Write a program to create class name as Cube with two methods
//void setValue(int x): this function accept number as parameter
//int getCube(): this function can calculate cube of number and return it.

class cube
{
	int no;
	
	void setValue(int x)
	{
	    no=x;
	}
	int getCube()
	{
	  int cubes= no*no*no;
	  return cubes;
	}
	public static void main (String [] args)
	{
		cube b= new cube();
		b.setValue(10);
		int cubes = b.getCube();
		System.out.println(cubes);
	}	
}

