package Qspider;

import java.util.Scanner;

public class MiddleOfThreeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number"); // 10 20 30
		int a = sc.nextInt();
		System.out.println("Enter the Second number ");
		int b = sc.nextInt();
		System.out.println("Enter the third number ");
		int c = sc.nextInt();

		if (a > b && b > c) {
			System.out.println(b + " is middle number");
		} else if (b > a && a > c) {
			System.out.println(a + " is middle number");
		} else  {
			System.out.println(c + " is middle number");
		}

	}

}
