package StringEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex7 {
	
	public static void main(String[] args)throws Exception {
		
		// check given String is palindrome ro not
		
		 
	    System.out.println("Enter the String");
	    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	    String name = input.readLine();
	    String Name = name;
	    String s =""; 
	    for(int i=0;i<name.length();i++)
	    {
	    	char ch = name.charAt(i);
	    	s = ch + s;
	    }
	    if(s.equals(Name))
	    	System.out.println("it is palindrome");
	    else
	    	System.out.println("it is not palindrom");
	    
	}

}
