package Qspider;

import java.util.Scanner;

public class SmallestOfThreeNumber {
	
	static boolean b ;
	static char c;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second number ");
		int num2 = sc.nextInt();
		System.out.println("Enter the third number ");
		int num3 = sc.nextInt();
		
		if(num1<num2 && num1<num3)
			System.out.println(" smallest number :"+num1);
		else if(num2<num3)
			System.out.println("smallest number :"+num2);
		else
			System.out.println("smallest number :"+num3);
			
	}

}
