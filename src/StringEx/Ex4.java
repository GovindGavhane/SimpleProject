package StringEx;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		int len =0;
		 for(char c: s.toCharArray())
			 len++;
		System.out.println("length of String :"+len);
	}

}
