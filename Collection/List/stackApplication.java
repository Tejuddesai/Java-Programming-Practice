package List;
import java.util.ListIterator;
import java.util.Stack;
public class stackApplication {

	public static void main(String[] args)
	{
		Stack s = new Stack();
		s.push(100);
		s.push(200);
		s.push(300);
		s.push(400);
		s.push(500);
		System.out.println("Stack Data");
		ListIterator li = s.listIterator(s.size());
		while(li.hasPrevious())
		{
			Object obj = li.previous();
			System.out.println(obj);
		}

		int index = s.search(300);
		System.out.println("search 300 in stack and give me id : " + index);

		Object obj = s.pop();
		System.out.println("Removed element in list:"+ obj);

		li = s.listIterator(s.size());
		while(li.hasPrevious())
		{
			 obj = li.previous();
			 System.out.println(obj);

		}
		obj = s.peek();
		System.out.println("Peek element from stack : " + obj);
		System.out.println("After peek Operation");
		li = s.listIterator(s.size());
		while(li.hasPrevious()) {
			obj = li.previous();
			System.out.println(obj);
		}
	}

}
