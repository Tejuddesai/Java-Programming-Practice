package List;
import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayListApplication {

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		do {

			System.out.println("1.Add New Elements");
			System.out.println("2.View All Elements");
			System.out.println("3.Search Elements in ArrayList");
			System.out.println("4.Delete Elements for ArrayList");
			System.out.println("5.Check Size of ArrayList");
			System.out.println("6.Retrive data from ArrayList");

			Scanner sc = new Scanner(System.in);
			int choise = sc.nextInt();

			switch(choise)
			{
			  case 1:
				   System.out.println("Enter New Value ");
				   int val = sc.nextInt();
				   boolean b = al.add(val);
				   if(b)
				   {
					   System.out.println("Add In Collection");
				   }
				   else {
					    System.out.println("Value does not add");
				   }

				break;

			  case 2:
				  System.out.println("View all Elements");
				  for(Object obj : al)
				  {
					   System.out.println(obj);
				  }

				break;

			  case 3:
				  System.out.println("Enter data for search");
				  int data = sc.nextInt();
				  b = al.contains(data);
				  if(b)
				  {
					  System.out.println("Data found");
				  }
				  else
				  {
					 System.out.println("Data not found");
				  }
			     break;

			  case 4:

				  System.out.println("Enter Data from delete");
				  data = sc.nextInt();
				  int index = al.indexOf(data);
				  if(index!= -1)
				  {
					  al.remove(index);
					  System.out.println("Data deleted");
				  }
				  else
				  {
					  System.out.println("Data not found");
				  }

				  break;

			  case 5:
				   int size = al.size();
				   System.out.println("Size of ArrayList is : " + size);

				   break;

			  case 6:
				  System.exit(0);
				  break;

			  default:
				  System.out.println("This is invalid choise");
			}
		}while(true);
	}
 }

