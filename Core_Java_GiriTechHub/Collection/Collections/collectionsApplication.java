package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class student implements Comparable<student> {

	int id;
	String name;

	student(int id, String name) {
		this.id = id;
		this.name = name;

	}

	@Override
	public int compareTo(student s)
	{
		return this.id - s.id;
	}

	@Override
	public String toString() {
		return id + " " + name;
	}

//	@Override
//
//	public int compareTo(student s)
//	{
//		return this.name.compareTo(s.name);
//	}
}

public class collectionsApplication {

	public static void main(String[] args) {
		List<student> list = new ArrayList<>();
		list.add(new student(101, "aol"));
		list.add(new student(103, "code"));
		list.add(new student(104, "bsf"));
		list.add(new student(102, "faq"));
		list.add(new student(106, "ele"));
		list.add(new student(105, "dyp"));

		Collections.sort(list);
//		System.out.println(list);
		for (student s : list)
		{
			System.out.println(s);
		}

	}
}
