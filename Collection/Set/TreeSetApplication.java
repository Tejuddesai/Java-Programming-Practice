package Set;
import java.util.NavigableSet;
import java.util.TreeSet;
public class TreeSetApplication {

	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
		ts.add(40);
		ts.add(20);
		ts.add(30);
		ts.add(50);
		ts.add(10);
		System.out.println("Data is in Accending order");
		for(Object obj:ts)
		{
			System.out.println(obj);
		}
		System.out.println("Data is in Decending order");

		NavigableSet nav = ts.descendingSet();

		for(Object obj:nav)
		{
			System.out.println(obj);
		}

	}
}
