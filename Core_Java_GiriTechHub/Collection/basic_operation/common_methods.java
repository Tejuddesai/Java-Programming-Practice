package basic_operation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class common_methods {

	public static void main(String[] args)
	{

		List<String> data= new ArrayList<>(Arrays.asList ("Teju","oju","digu","pratham"));
		data.add("Suhas");
		data.add("Aadi");
		System.out.println(data);

		System.out.println(data.get(2)); // find this indexted element
		System.out.println(data.remove(1)); //remove this indexed element
		System.out.println(data);
		System.out.println(data.set(1,"Kiran"));//update
		System.out.println(data);
		System.out.println(data.contains("Ravi")); //using contians method to cheak the data return true /false
		System.out.println(data.contains("Kiran"));

	}
}
