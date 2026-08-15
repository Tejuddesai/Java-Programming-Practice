package List;
import java.util.ArrayList;
public class Array_List
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<>();
		list.add(100);
		list.add(50);
		list.add(20);
		//list.remove(1);
		list.set(2,1000);
		//System.out.println(list.get(1));

//		for(int i=0;i<list.size();i++)
//		{
//			//System.out.println(list);
//			System.out.println(list.get(i));
//		}


//		System.out.println(list.contains(100));
//		System.out.println(list.contains(300));
//		System.out.println(list.remove(2));
		for(int x: list)
		{
			System.out.println(x);
		}

	}
}