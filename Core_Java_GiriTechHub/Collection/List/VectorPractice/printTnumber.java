package List.VectorPractice;
import java.util.Scanner;
import java.util.Vector;
public class printTnumber {
	public static void main(String[] args)
	{
		Vector<Integer> v = new Vector<>();
		System.out.println("How Many Elements do you want to store");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter Elements: ");
		for(int i=1; i<=n; i++)
		{

			int num = sc.nextInt();
         	v.add(num);

		}

		//----------search number ----------
//		System.out.println("Enter Number to Search : ");
//		int s = sc.nextInt();
//		if(v.contains(s))
//		{
//			System.out.println("Element found in vector");
//		}
//		else
//		{
//			System.out.println("Element is not found in vector");
//
//		}

		// ------------remove number -------------

//		System.out.println("Enter Number for romove the vector: ");
////		int r = sc.nextInt();

////		if(v.remove())
////		{
////			System.out.println("Remove form vector");
////		}
//		else
//		{
//			System.out.println("Element is not found in vector");
		}
	}
