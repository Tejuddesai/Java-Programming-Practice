
//24.A movie booking system needs Silver, Gold, and Platinum seat pricing. How would you implement this?
import java.util.*;

abstract class ticketbooking {
	abstract void booking();

}

class Silver extends ticketbooking {
	void booking() {
		System.out.println("*********** Silver ticket ***********");
		System.out.println("Silver ticket price is : 400");

		Scanner sc = new Scanner(System.in);
		System.out.println("****Do you want to confirm your ticket***** ?");
		String Ans = sc.nextLine();

		if (Ans.equals("yes")) {
			int amount;
			while (true) {
				System.out.print("Please Enter the Amount: ");
				amount = sc.nextInt();

				if (amount == 400) {
					System.out.println("***********Your Silver Ticket is Comfirm ! ***********");
					break;

				} else {
					System.out.println("Plese Enter the Correct Ticket amount");
				}
			}
		} else {
			System.err.println("Booking is Cancled");
		}

	}
}

class Gold extends ticketbooking {
	void booking() {
		System.out.println("*********** Gold ticket ***********");
		System.out.println("Gold ticket price is : 800");

		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to confirm your ticket ?");
		String Ans = sc.nextLine();

		if (Ans.equals("yes")) {

			int amount;
			while (true) {
				System.out.println("Please Enter the Amount: ");
				amount = sc.nextInt();

				if (amount == 800) {
					System.out.println("Your Gold Ticket is Comfirm");
				break;

				} else {
					System.out.println("Plese Enter the Correct Ticket amount :");
				}
			}
		} else {
			System.err.println("Booking is Cancled");
		}

	}
}

class Platinum extends ticketbooking {
	void booking() {
		System.out.println("*********** Platinum ticket ***********");
		System.out.println("Platinum ticket price is : 1200");
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to confirm your ticket ?");
		String Ans = sc.nextLine();
		System.out.println("");

		if (Ans.equals("yes")) {

			int amount;
			while (true) {
				System.out.println("Please Enter the Amount: ");
				amount = sc.nextInt();

				if (amount == 1200) {
					System.out.println("Your Platinum Ticket is Comfirm");
					break;

				} else {
					System.out.println("Plese Enter the Correct Ticket amount");
				}
			}

		} else {
			System.err.println("Booking is Cancled");
		}

	}
}

public class MovieBooking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {
				
				System.out.println("SELECT SEAT");
				System.out.println("1.Silver");
				System.out.println("2.Gold");
				System.out.println("3.Platinum");
				System.out.println(" ");
				System.out.println("*********** Enter your choise ***********");

				int choose = sc.nextInt();

				switch (choose) {
				case 1:
					Silver s = new Silver();
					s.booking();
					return;

				case 2:
					Gold g = new Gold();
					g.booking();
					return;

				case 3:
					Platinum p = new Platinum();
					p.booking();
					return;

				default:
					System.err.println("This is Invalid Ticket No ! Try againg");
				}
			} catch (Exception e) {
				System.err.println("Invalid input! Please enter numbers only.");
				System.out.println("-------------*****------------");
				sc.nextLine();
			}
		}
	}
}
