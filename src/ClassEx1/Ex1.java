package ClassEx1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		int pizza = 0, puffs = 0, cooldrink = 0, bill = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = s.next();
		System.out.println("Enter your choice");
		System.out.println("1.pizza price 100");
		System.out.println("2.puffs price 20");
		System.out.println("3.cooldrink price 10");

		int choice = s.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter the Quntity of pizza price");
			pizza = s.nextInt();
			pizza = pizza * 100;

		case 2:
			System.out.println("Enter the Quntity of puffs ");
			puffs = s.nextInt();
			puffs = puffs * 20;

		case 3:
			System.out.println("Enter the Quntity of cooldrink");
			cooldrink = s.nextInt();
			cooldrink = cooldrink * 10;
			break;
		default:
			System.out.println("Please Enter the Valid Choise");

		}
		System.out.println("Do You have Coupon Code? ");
		System.out.println("Enter the choice");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int c = s.nextInt();
		switch (c) {
		case 1:
			System.out.println("Enter the Coupon code");
			int code = s.nextInt();
			if (100 == code) {
				System.out.println("Ente the Discount");
				int discount = s.nextInt();
				bill = pizza + puffs + cooldrink;
				System.out.println(" your bill is :" + ((bill) - (bill * discount / 100)));
			} else {
				System.out.println("Please Enter the Valid Coupon code !!!!");
			}
			break;
		case 2:
			System.out.println(" your bill is :" + bill);
			break;
		default:
			System.out.println("Please Enter the valid choice");
		}

		System.out.println(" INJOY THE SHOW..." + name);

	}

}
