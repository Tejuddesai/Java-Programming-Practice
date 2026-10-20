//12.A school system stores Student and Teacher details with some common properties. 
//How would you avoid duplicate code?

class schoolsData
{
	String school_name = "xyz";
	String School_medium = "English Medium";
	
}

class StudentsData extends schoolsData
{
	String student_id = "22";
	String student_name ="www";
	
	void display()
	{
	
		System.out.println("My School Name is:" + school_name);
		System.out.println("I am in :" + School_medium);
		System.out.println("My id is: " + student_id);
		System.out.println("student_name:" + student_name);
	
	}
			
}

class Teacher extends schoolsData
{
	String teacher_id = "2";
	String teache_name = "poe";
	
	void display()
	{
		System.out.println("My School Name is:" + school_name);	
		System.out.println("I am in :" + School_medium);
		System.out.println("My Teacher is: " + teacher_id);
		System.out.println("My Teacher Name is:" + teache_name);
	}
	
}
public class Teachers_Data {
	
	public static void main(String[] args)
	{
		StudentsData s = new StudentsData();
		s.display();
		
		Teacher t= new Teacher();
		t.display();
	}
	 
}
