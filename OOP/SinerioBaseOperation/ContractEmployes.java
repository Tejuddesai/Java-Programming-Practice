//Create an abstract class Employee with employee details and an abstract method calculateSalary(). 
//Create an interface Bonus with method calculateBonus(). 
//Implement both in PermanentEmployee and ContractEmployee. 
//Explanation: • Permanent employees receive a bonus of 15% of salary.  
//• Contract employees receive a bonus of 5%. 
//• Use constructor to initialize employee information.  • Calculate salary + bonus. 
//• Display employee type, salary, bonus and final amount.  



import java.util.*;

//Abstract class
abstract class EmployeeDetails {

 private String empName;
 private int salary;

 // Constructor
 EmployeeDetails(String empName, int salary) {
     this.empName = empName;
     this.salary = salary;
 }

 public String getEmpName() {
     return empName;
 }

 public int getSalary() {
     return salary;
 }

 // Abstract method
 abstract double calculateSalary();
}


//Interface
interface Bonus {

 double calculateBonus();
}


//Permanent Employee
class PermanentEmployee extends EmployeeDetails implements Bonus {

 PermanentEmployee(String empName, int salary) {
     super(empName, salary);
 }

 // 15% bonus
 public double calculateBonus() {
     return getSalary() * 15 / 100.0;
 }

 // Salary + Bonus
 double calculateSalary() {
     return getSalary() + calculateBonus();
 }

 void display() {
     System.out.println("Employee Type : Permanent Employee");
     System.out.println("Employee Name : " + getEmpName());
     System.out.println("Salary        : " + getSalary());
     System.out.println("Bonus (15%)   : " + calculateBonus());
     System.out.println("Final Amount  : " + calculateSalary());
     System.out.println();
 }
}


//Contract Employee
class ContractEmployee extends EmployeeDetails implements Bonus {

 ContractEmployee(String empName, int salary) {
     super(empName, salary);
 }

 // 5% bonus
 public double calculateBonus() {
     return getSalary() * 5 / 100.0;
 }

 // Salary + Bonus
 double calculateSalary() {
     return getSalary() + calculateBonus();
 }

 void display() {
     System.out.println("Employee Type : Contract Employee");
     System.out.println("Employee Name : " + getEmpName());
     System.out.println("Salary        : " + getSalary());
     System.out.println("Bonus (5%)    : " + calculateBonus());
     System.out.println("Final Amount  : " + calculateSalary());
     System.out.println();
 }
}


//Main class
public class ContractEmployes {

 public static void main(String[] args) {

     PermanentEmployee p =
             new PermanentEmployee("Rahul", 50000);

     ContractEmployee c =
             new ContractEmployee("Amit", 30000);

     p.display();
     c.display();
 }
}
