class methods{

public static void main (String[] args)
{
   
  StringBuffer sb = new StringBuffer("Good Moring INDIA ");
  System.out.println("string is : " + sb);
  sb.append("   I LOVE MY COUNTRY ");
  System.out.println("after append the string : " + sb);
  sb.insert(17, "   India is my Country ");
  System.out.println("after inset new line in string : " + sb);
  sb.delete(0,17);
  System.out.println("after delting some context in string :" + sb);
}
}