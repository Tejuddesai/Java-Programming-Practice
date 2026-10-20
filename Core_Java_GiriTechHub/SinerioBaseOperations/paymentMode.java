//1. A customer can pay using Credit Card, UPI or Net Banking 
//How would you design this using OOP?   
//Abstraction + Polymorphism(Runtime Polymorphism)



import java.util.Scanner;

abstract class CustomerPaymentSystem {

    abstract void payment();
}

// Credit Card
class Card extends CustomerPaymentSystem {

    String cardNumber;
    String cvv;

    void payment() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Card Number: ");
        cardNumber = sc.next();

        System.out.print("Enter Card CVV: ");
        cvv = sc.next();

        System.out.println("Credit Card payment processing...");
        System.out.println("Proceed to pay");
    }
}

// UPI
class UPID extends CustomerPaymentSystem {

    String upiId;

    void payment() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter UPI ID: ");
        upiId = sc.next();

        System.out.println("UPI payment processing...");
        System.out.println("Proceed to pay");
    }
}

// Net Banking
class NetBankingPayment extends CustomerPaymentSystem {

    String accountNo;
    String ifscCode;
    String bankName;

    void payment() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bank Name: ");
        bankName = sc.next();

        System.out.print("Enter Account Number: ");
        accountNo = sc.next();

        System.out.print("Enter IFSC Code: ");
        ifscCode = sc.next();

        System.out.println("Net Banking payment processing...");
        System.out.println("Proceed to pay");
    }
}

// Main class
public class paymentMode {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Payment Mode");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Net Banking");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        CustomerPaymentSystem payment;

        switch (choice) {

            case 1:
                payment = new Card();
                payment.payment();
                break;

            case 2:
                payment = new UPID();
                payment.payment();
                break;

            case 3:
                payment = new NetBankingPayment();
                payment.payment();
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
