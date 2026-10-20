//Q5. Create an Employee POJO class with id, name, department, salary, and experience. 
//Implement CRUD operations using class , object , pojo class. 
//Add a search operation to find employees based on department and minimum salary. 
//Explanation: Create an Employee class with private fields, constructors, getters and setters. 
//Maintain employee objects inside an ArrayList. 
//Implement: • Add Employee  • Update Employee by ID  
//• Delete Employee by ID  • Display all employees  
//• Search employees by department 


package List;
import java.util.*;

class Employee_data implements Comparable<Employee_data> {
	
	private int id;
	private String name;
	private String department;
	private int salary;
	private int experience;
	
	Employee_data(int id, String name,String department,int salary,int experience)
	{
		this.id =  id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.experience = experience;		
	}

	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getDepartment() {
		return department;
	}

	
	public void setDepartment(String department) {
		this.department = department;
	}

	
	public int getSalary() {
		return salary;
	}

	
	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	public int getExperience() {
		return experience;
	}

	
	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int compareTo(Employee_data d) {
		
		return this.department.compareTo(d.department);
	}
	
	@Override
	public String toString() {
	    return "Employee [id=" + id +
	           ", name=" + name +
	           ", department=" + department +
	           ", salary=" + salary +
	           ", experience=" + experience + "]";
	}
}

public class Employee_CRUD  {

	public static void main (String[] args) {
		
	
	List<Employee_data> employee = new ArrayList<>();
	
	
	//• Add Employee
	employee.add(new Employee_data(101,"Rahul", "IT", 50000, 3));
	employee.add(new Employee_data(102,"Priya", "HR", 45000, 2));
	employee.add(new Employee_data(103, "Amit", "IT", 65000, 5));
    employee.add(new Employee_data(104, "Sneha", "Finance", 55000, 4));
    employee.add(new Employee_data(105, "Rohit", "Sales", 40000, 2));
    employee.add(new Employee_data(106, "Neha", "IT", 70000, 6));
    employee.add(new Employee_data(107, "Akash", "Marketing", 48000, 3));
    employee.add(new Employee_data(108, "Pooja", "HR", 52000, 4));
    employee.add(new Employee_data(109, "Vijay", "Finance", 60000, 5));
    employee.add(new Employee_data(110, "Kiran", "Sales", 38000, 1));
	
    //• Display all employees 
    for(Object obj: employee )
    {
    	System.out.println(obj);
    }
    
  //• Delete Employee by ID  

    int deleteId = 101;

    for (int i = 0; i < employee.size(); i++) {

        if (employee.get(i).getId() == deleteId) {

            employee.remove(i);

            System.out.println("Employee deleted successfully");
            break;
        }
         
    }
    
 //• Update Employee by ID

    
    for(Employee_data e: employee )
    {
    	 if (e.getId() == 109) {

    	        e.setName("Teju");
    	        e.setDepartment("IT");
    	        e.setSalary(55000);
    	        e.setExperience(3);

    	        System.out.println("Employee updated successfully");
    	        break;
    	    }
    	
    	System.out.println(e);
    }
    
    
    //• Search employees by department and Minimum salary 
    
    String searchDepartment = "HR";
    int minimumSalary = 45000;
    Collections.sort(employee);
    System.out.println("Search Result:");

    for (Employee_data e : employee) {
    	
        if (e.getDepartment().equals(searchDepartment)
                && e.getSalary() >= minimumSalary) {

            System.out.println(e);
        }
        
        
    }
  
	}
}
