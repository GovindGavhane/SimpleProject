package StringEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex6 {
	
	public static void main(String[] args) {
		
		// remove vovel from the String 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String s = sc.next();
		String s2="";
		 s2 = s.replaceAll("[aioueAIOUE]","");
		System.out.println(s2);
		
		 
		
	}

}
