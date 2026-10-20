package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class employee {


	private long emp_id;
	private String name;
	private String domain;

	public employee(long emp_id, String name, String domain) {
		this.emp_id = emp_id;
		this.name = name;
		this.domain = domain;
	}

	@Override
	public String toString()
	{
		return emp_id + " " + name + " " + domain ;
	}


}
public class mapApplication {


		public static void main(String[] args) {

			Map<String, Map<String, Collection<employee>>> emp = new HashMap<>();


			Map<String, Collection<employee> > developer = new HashMap<>();

			Collection<employee> e = new ArrayList<>();


			e.add(new employee(101,"Teju","java"));
			e.add(new employee(102,"oju","SpringBoot"));
			e.add(new employee(103,"moju", "React"));

			developer.put("Employee", e);
			emp.put("Developer", developer);

		    for(Object obj: e)
		    {
		    	System.out.println(obj);
		    }

		}

	}

