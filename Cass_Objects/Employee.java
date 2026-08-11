//Write program to create POJO class name as Employee with id,name and salary attribute and
//store data in object and retrieve data from object

class Employee {

private int id;
private String name;
private long salary;

void setId( int id)
{
	this.id=id;
}
void setName(String name)
{
	this.name=name;
}	
void setSalary(long salary)
{
	this.salary=salary;
}

int getId()
{
	return id;
}

String getName()
{
	return name;
}

long getSalary()
{
	return salary;
}
public static void main(String[] args)
{
    Employee e= new Employee();
	e.setId(58);
	e.setName("Tejaswi");
	e.setSalary(50000);
	
	//int id = e.getId();
	System.out.println("Employee id is :" + e.getId());
	
	String name= e.getName();
	System.out.println("Employee Name :" + name);
	
	long salary= e.getSalary();
	System.out.println("Employee Salary :" + salary);
}
}

//pojo = plain old java object
//use getter setter, private variables, 

