package List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class Reverse_Array {

	public static void main(String[] arg)
	{

		List<Integer> Name= new ArrayList<>(Arrays.asList(1,2,3,5,4,5));


		Collections.reverse(Name);
		System.out.println(Name); //reverse

		Set<Integer> dublicate= new TreeSet<>(Name);

		System.out.println(dublicate);

	}

}
