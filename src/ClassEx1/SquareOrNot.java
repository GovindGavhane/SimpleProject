package ClassEx1;

import java.io.*;

public class SquareOrNot {
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Length"); 
		int length =Integer.parseInt(reader.readLine());
		System.out.println("Enter the breadth");
		int breadth = Integer.parseInt(reader.readLine());
		if(length==breadth)
		{
			System.out.println("It is Square");
		}
		else
		{
			System.out.println("it is not square");
		}
		 
		
	}

}
