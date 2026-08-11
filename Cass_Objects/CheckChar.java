//Write program to create class name as CheckChar with two functions
//void setChar(char ch): this function accept single character as input
//boolean checkChar(): this function can check character is alphabet or digit of special symbol if
//character is alphabet or digit return true if character is digit then return false.

class CheckChar{
	
	 char ch;
	 
	 void setChar(char c)
	 {
		 ch=c;
	 }
	 boolean checkChar()
	 {
		 if((ch >= 'A' && ch <='z')|| (ch >= 'a' && ch <='z') || (ch >= 0 && ch <= 9))
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
		 
	 }
	 public static void main (String[] args)
	 {
		 CheckChar c = new CheckChar();
		 c.setChar('8');
		 boolean cha = c.checkChar();
		 System.out.println(cha);
		 
	 }
}