class square{
 
 private int no;
 square(int no)
 {
   this.no=no;
 }
 void getsquare()
 {
  System.out.println(" 5 th square is:" + no*no);
 }
 public static void main(String[] args)
 {
    square s= new square(5);
	s.getsquare();
 }
}