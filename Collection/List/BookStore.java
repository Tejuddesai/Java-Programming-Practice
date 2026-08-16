package List;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Book {

	int bookNo;
    String bookName;
    String author;
    long price;

    Book(int bookNo, String bookName, String author, long price) {
        this.bookNo = bookNo;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }


    @Override
	public String toString() {
        return "Book No : " + bookNo +
               ", Book Name : " + bookName +
               ", Author : " + author +
               ", Price : " + price;
    }


	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}


}

public class BookStore {

	public static void main (String[] args)
	{
		ArrayList al= new ArrayList();

		do {




			System.out.println("1.Add new book");
			System.out.println("2.View All Book");
			System.out.println("3.Search Book By Id");
			System.out.println("4.Delete Book By Book id");
            System.out.println("5.Update Book Details by Id");
            System.out.println("6.Count number of book");
            System.out.println("7.Count book by same price");
            System.out.println("8.Show the book authorwise");
            System.out.println("==============================");
            System.out.print("Enter your choise :" );

            Scanner sc = new Scanner(System.in);
            try {
            int choise = sc.nextInt();



            switch(choise)
            {
            case 1:
            	System.out.print("Add Books NO:");
            	int bookNo = sc.nextInt();
            	sc.nextLine();
            	System.out.print("Enter Book Name:");
            	String bookName = sc.nextLine();
            	System.out.print("Enter Book Price :");
            	long price = sc.nextLong();
            	sc.nextLine();
            	System.out.print("Enter Book Author :");
            	String author = sc.nextLine();
            	System.out.println("==============================");

            	Book books = new Book(bookNo,bookName,author,price);

            	boolean b = al.add(books);
            	if(b)
            	{
            		System.out.println("**** Add in book list ****");
            	}
            	else
            	{
            		System.out.println("Book Did not add in list ");
            	}
              break;

            case 2:
            	for(Object obj : al)
            	{
            		System.out.println(obj);
            	}
              break;

            case 3:
            	System.out.println("Enter Book Number for Search");
//
            	bookNo = sc.nextInt();
            	for (Object obj : al)
            	{
            		Book book = (Book)obj;
            		if(book.getBookNo() == bookNo)
            		{
            			System.out.println(obj);
            		}
            	}
              break;

            case 4:
            	System.out.println("Enter Book Id for Delete Book");
            	bookNo = sc.nextInt();
            	for(Object obj: al)
            	{
            		Book book = (Book)obj;


            	if(book.getBookNo() == bookNo)
            	{
            		al.remove(bookNo);
            		System.out.println("**** Delet book in list ****");
            	}
            	else
            	{
            		System.out.println("This book is not present in list ");
            	}
            	}
            	break;

            case 5:
            	System.out.println("Enter id for update book details");
            	bookNo = sc.nextInt();
            	for(Object obj : al )
            	{
            		Book book = (Book)obj;
            		if(book.getBookNo() == bookNo)
            		{
            			System.out.println("Enter New Book Name:");
                    	bookName = sc.nextLine();
                    	System.out.println("Enter New Book Price :");
                    	price = sc.nextLong();
                    	sc.nextLine();
                    	System.out.println("Enter New Book Author :");
                    	author = sc.nextLine();
                    	System.out.println("=============== Updated Successfully ===============");
            		}
            		else
            		{
            			System.out.println("Book No is not found");
            		}
            	}
            	break;

            case 6:

            	int size = al.size();
            	System.out.println("Total size of books is: " + size);
            	break;

            case 7:
            	System.out.println("Book list same price");
            	price = sc.nextInt();
            	boolean found = false;
            	for(Object obj: al)
            	{
            		Book book = (Book)obj;
            		if(book.getPrice() == price)
            		{
            			System.out.println("this book price is sam as your accepted price: " + book.getBookName());
            			found = true;
            			break;
            		}
            		if(!found)
            		{
            			System.out.println("Your price does not match listed Book price");
            		}
            	}
//            	b = al.equals(price);
//            	if(b)
//            	{
//            		bookName = sc.nextLine();
//            		bookNo = sc.nextInt();
//            		index = al.indexOf(bookNo);
//            		System.out.println(bookName.charAt(index));
//            	}
//            	else
//            	{
//            		System.out.println("All books are different prices");
//            	}
            	break;

            case 8:
            	System.out.println("Enter Book id and show the authorwise");
            	bookNo = sc.nextInt();
            	found = false;
            	for(Object obj:al)
            	{
            		Book book = (Book)obj;
            		if(book.getBookNo() == bookNo)
            		{
            			System.out.println("Book Auther is: " + book.getAuthor());
            			found = true;
            			break;
            		}
            		if(!found) {
            			System.out.println("Book not found");
            		}
            	}


            }

			}
			catch(InputMismatchException e)
			{
				System.out.println("Invalid input! please Enter correct Data");

				sc.nextLine();
			}
		}while(true);

	}

}
