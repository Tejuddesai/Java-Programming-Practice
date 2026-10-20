// Write a Java program to demonstrate Method Overriding and Runtime Polymorphism 
// using a parent class Animal and child classes Dog and Cat. 

package Inheritance;

public class Animal {

	void sound()
	{
		System.out.println("Anima has differnt sounds ");
	}
}
class Dog extends Animal 
{
	void sound()
	{
		System.out.println("Dog is barking");
	}
}
class cat extends Animal
{
	void sound()
	{
		System.out.println("Cat sound is mau mau");
	}
	public static void main(String[] args)
	{
		Animal a= new Dog();
		a.sound();
		
		Animal b= new cat();
		b.sound();
	}
}



