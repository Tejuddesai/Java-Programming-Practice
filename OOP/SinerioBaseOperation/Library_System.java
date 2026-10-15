
import java.util.Scanner;

abstract class Library_section {
    abstract void display();
}

class Book extends Library_section {
    void display() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Book Section");
        System.out.println("Enter Book Name:");
        String bookName = sc.nextLine();

        System.out.println("Enter Book Writer Name:");
        String writerName = sc.nextLine();

        System.out.println("Book Name: " + bookName);
        System.out.println("Writer Name: " + writerName);
    }
}

class Magazines extends Library_section {
    void display() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Magazine Section");
        System.out.println("Enter Magazine Name:");
        String magazineName = sc.nextLine();

        System.out.println("Enter Magazine Publisher Name:");
        String publisherName = sc.nextLine();

        System.out.println("Magazine Name: " + magazineName);
        System.out.println("Publisher Name: " + publisherName);
    }
}

class Newspapers extends Library_section {
    void display() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Newspaper Section");
        System.out.println("Enter Newspaper Name:");
        String newspaperName = sc.nextLine();

        System.out.println("Newspaper Name: " + newspaperName);
    }
}

public class Library_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Library Section");
        System.out.println("1. Book");
        System.out.println("2. Magazine");
        System.out.println("3. Newspaper");

        int choice = sc.nextInt();

        Library_section obj;

        if (choice == 1) {
            obj = new Book();
            obj.display();
        } else if (choice == 2) {
            obj = new Magazines();
            obj.display();
        } else if (choice == 3) {
            obj = new Newspapers();
            obj.display();
        } else {
            System.out.println("Invalid Choice");
        }
    }
}
