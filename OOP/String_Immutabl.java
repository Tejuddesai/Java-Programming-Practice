
public class String_Immutabl {
	
	public static void main(String[] args)
	{
		String a1="java";
		String a2="java";
		String a3 = new String("java");
		
		System.out.println(a1==a2);
		System.out.println(a1==a3);
		System.out.println(a1.equals(a3));
		
	}

}
