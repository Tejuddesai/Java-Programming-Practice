package List;

import java.util.Vector;



public class vector {

	public static void main(String[] arg)
	{
		Vector<Integer> v= new Vector<>(2,3);
		v.add(4);
		v.add(5);
		System.out.println(v);
		v.add(7);
		//System.out.println(v.capacity());
		v.clear();
		System.out.println(v);

	}


}
