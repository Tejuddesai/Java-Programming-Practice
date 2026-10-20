package List;
import java.util.LinkedList;
public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add(100);
		list.add(200);
		list.add(300);
		list.addFirst(400);
		list.add(500);
		list.addLast(800);
		list.addFirst(1000);
		list.addLast(1500);
		for(Object obj:list)
		{
			System.out.println(obj);
		}

	}



}
