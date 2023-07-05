package StringEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex9 {
	
	public static void main(String[] args)throws Exception {
		
		// removo all the character from String except alphabet
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String s = input.readLine();
		String s1 = s.replaceAll("[^a-zA-Z]", "");
		System.out.println(s1);
		
		
	}

}
