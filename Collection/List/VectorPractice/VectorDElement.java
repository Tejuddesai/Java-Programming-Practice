package List.VectorPractice;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;
public class VectorDElement {

//	public static void main(String[] args)
//	{
//		Vector v = new Vector();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 5 elements in vector:");
//
//		for(int i=1; i<=5; i++)
//		{
//		int num = sc.nextInt();
//		v.add(num);
//		}
//		System.out.println("Vector Elements Are :");
//		for(Object obj:v) {
//
//			System.out.println(obj);
//			}
//		}




	public static void main(String[] args)
	{
		Vector<Integer> v = new Vector<>();
		System.out.println("Enter 5 Elements in Vector");
		try {
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=5; i++)
		{
		int num = sc.nextInt();
		v.add(num);
		}
		System.out.println("Vector Elements are:");
		for(Integer i:v)
		{
			System.out.println(i);
		}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter Numbers only!");
		}
	}
}


