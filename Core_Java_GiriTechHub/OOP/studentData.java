
 //Write a Java program to demonstrate Encapsulation by creating a Student class 
//with private data members name and age, and public getter and setter methods. 

class studentInfo {
	
	private String name ;
	private int age ;
	
	studentInfo(String name,int age)
	{
		 this.name = name;
		 this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
}

public class studentData{
	
	public static void main(String[] args)
	{
		studentInfo s= new studentInfo("Teju",25);
		System.out.println("Student name is :"+ s.getName());
		System.out.println("Student age is :" + s.getAge());
		
		s.setName("Sayali");
		s.setAge(24);
		
		System.out.println("Updated name: " + s.getName());
        System.out.println("Updated age: " + s.getAge());
		
		
		
		
		
		
		
	}
}

