package StringEx;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		char ch = sc.next().charAt(0);
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		System.out.println("it is alphabet");
		else
		System.out.println("it is not Alphabet");
	}

}
