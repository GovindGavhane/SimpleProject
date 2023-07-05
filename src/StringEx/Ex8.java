package StringEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex8 {
	
	public static void main(String[] args)throws Exception {
		
		// print reverce order
		
		System.out.println("Enter the String");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String s = input.readLine();
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch = s.charAt(i);
			s1+=ch;
		}
		System.out.println(" Reverce String :"+s1);
		
	}

}
