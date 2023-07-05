package StringEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex10 {
	
	public static void main(String[] args)throws Exception {
		
		// removo all spaces of String
		
	  System.out.println("Enter the String");
	  BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	  String s = input.readLine();
	   String s1 = s.replaceAll(" ", "");
	   System.out.println(s1);
	}

}
