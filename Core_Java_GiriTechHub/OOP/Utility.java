
class school{
	
	static int maths(String name, int marks)
	{
		System.out.print("Name is" + name + "Maths marks is ");
		return marks;
	}
	
	static int science(String name, int marks)
	{
		System.out.print("Name is" + name + "Science marks is ");
		return marks;
	}
	
	static int Physics(String name, int marks)
	{
		System.out.print("Name is" + name + "Physics marks is ");
		return marks;
	}
}

public class Utility {
	
	public static void main(String[] args)
	{
		System.out.println(school.maths("OJU", 120));
		System.out.println(school.science("kaju", 190));
		System.out.println(school.Physics("Teju", 200));
		
	}

}
