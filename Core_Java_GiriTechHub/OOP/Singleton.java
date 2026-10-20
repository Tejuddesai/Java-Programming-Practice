



class printer{
	
	private static printer p = new printer();
	private printer() {
		
	}
	public static printer getInstance()
	{
		return p;
	}
}


public class Singleton {
	
	public static void main(String[] args)
	{
		printer p1 = printer.getInstance();
		printer p2 = printer.getInstance();
		System.out.println(p1 == p2);
	}

}