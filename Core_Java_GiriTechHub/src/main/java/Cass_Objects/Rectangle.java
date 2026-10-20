/* Q2. Write program to create class name Area with methods name as void setRadius(float radius) and
void setLengthWidth(int len,int wid) and two child classes name as Circle and Rectangle so you have
to define float getCircleArea() method in Circle child class and calculate area of circle and return it */

class Area{
	
	float r;
	int l,w;
	void setRadius(float radius)
	{
		this.r= radius;
	}
	
	void setLengthWidth(int len, int wid)
	{
		this.l=len;
		this.w=wid;
	}
}
class Circle extends Area
{
	float getCircleArea()
	{
		 
		System.out.println("Circular Area is :" + (3.14f*r*r));
		return 3.14f*r*r;
	}
	
}

class Rectangle extends Area 
{
	int getRectangularArea()
	{
		 
		System.out.println("Rectangular Area is :" + (l*w));
		return l*w;
	}
	
	public static void main (String[] args)
	{
		Circle c = new Circle();
		c.setRadius(6);
		c.getCircleArea();
		
		Rectangle r = new Rectangle();
		r.setLengthWidth(5,8);
		r.getRectangularArea();
	}
	
}