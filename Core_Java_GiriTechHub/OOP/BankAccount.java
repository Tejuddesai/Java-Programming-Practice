//Write a Java program to demonstrate Data Hiding using the private access modifier. 
//Create a BankAccount class with a private balance and methods to deposit 
//and display the balance

import java.util.Scanner;

class TestBank  {

	private int balance =1000;
	
	public void deposite()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Deposite Amount : ");
		int amount = sc.nextInt();
		if(amount > 0)
		{
		  balance = balance + amount;
		}
		else
		{
			System.out.println("Invalid deposite amount");
		}
	}
	
	public void display()
	{
		System.out.print("Bank Balance is :" + balance);
	}
}
public class BankAccount
{
	public static void main(String[] args)
	{
		TestBank t = new TestBank();
		t.deposite();
		t.display();
	}
}
