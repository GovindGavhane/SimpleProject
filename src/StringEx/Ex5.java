package StringEx;

import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) {
		
		  // count the number of vovels
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if((ch=='a'|| ch=='i' || ch=='u' || ch=='o' || ch=='e')||(ch=='A'|| ch=='I' || ch=='U' || ch=='O' || ch=='E'))
				count++;
		}
		System.out.println("Count of Vovels :"+count);
	}
	

}
