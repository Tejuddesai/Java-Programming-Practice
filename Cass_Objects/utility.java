class utility
{
 private utility()
 {
  System.out.println("I am constructor");
 }
 public static void Dog()
 {
 System.out.println("Hello i am Dog ");
 }
 public static void birds()
 {
  System.out.println("Hello i am Birds");
 }
 
 public static void utiltyInfo()
 {
	 System.out.println("Hello this is utility class program ");
 }
 
 public static void main(String[] args)
 { 
	utility u= new utility(); 
    Dog();
	birds();
	utiltyInfo();
 }
}