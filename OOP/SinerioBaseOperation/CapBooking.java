//4.A cab booking app has Mini, Sedan, and SUV rides 
//with different pricing. How would you model this system?
package SinerioBaseOperations;

import java.util.Scanner;

abstract class Cap {
    abstract void bookRide();
}

class Mini1 extends Cap {
    void bookRide() {
        System.out.println("Welcome to MINI Ride \n rate is 20/km");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name :");
        sc.next();
        System.out.print("Select ride area");
        sc.next();
        System.out.println("Your ride book Successfully");
    }
}

class Sedan1 extends Cap {
    void bookRide() {
        System.out.println("Welcome to SEDAN Ride \n rate is 25/km");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name :");
        sc.next();
        System.out.print("Select ride area");
        sc.next();
        System.out.println("Your ride book Successfully");
    }
}

class Suv1 extends Cap {
    void bookRide() {
        System.out.println("Welcome to SUV Ride \n rate is 30/km");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name :");
        sc.next();
        System.out.print("Select ride area");
        sc.next();
        System.out.println("Your ride book Successfully");
    }
}

public class CapBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the Ride");
        System.out.println("1.MINI");
        System.out.println("2.SEDAN");
        System.out.println("3.SUV");
        System.out.print("Select Ride : " );
        try {
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    Cap p = new Mini1();
                    p.bookRide();
                    break;
                case 2:
                    Cap p1 = new Sedan1();
                    p1.bookRide();
                    break;
                case 3:
                    Cap p2 = new Suv1();
                    p2.bookRide();
                    break;
                default:
                    System.out.println("Select Valid Ride");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}