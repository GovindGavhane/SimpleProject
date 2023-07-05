package ClassEx1;

import java.util.Scanner;

public class CheckCharacter {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = sc.next().charAt(0);
		if(ch>'A' && ch<'Z')
		{
			System.out.println("Upper Case Character");
		}
		else
		{
			System.out.println("Lower case Character");
		}
	}

}
