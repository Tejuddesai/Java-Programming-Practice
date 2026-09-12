
public class Encaspulation {
	
	private String Name;
	private int roll_NO;
	
	
	public void SetName(String Name)
	{
		this.Name=Name;
	}
	public String getName()
	{
		return Name;
	}
	public void SetRoll_NO(int roll_NO)
	{
		this.roll_NO= roll_NO;
	}
	public int getroll_NO()
	{
		return roll_NO;
	}
	
	public static void main(String[] arg)
	{
		Encaspulation  n=new Encaspulation();
		n.SetName("Teju");
		n.SetRoll_NO(30);
		
		System.out.println("Name:"+ n.getName());
		System.out.println("roll_NO:"+ n.getroll_NO());
		
	}
	
}
