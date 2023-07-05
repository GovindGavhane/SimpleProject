package ClassEx1;

import java.io.*;

public class EmployeeBonus {
	
	public static void main(String[] args)throws Exception {
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Exprientce");
		int exprience = Integer.parseInt(r.readLine());
		System.out.println("Enter the sallary");
		double sallary = Double.parseDouble(r.readLine());
		if(exprience>5)
		{
			System.out.println("Thak you for giving a hardwork for Organasasion you will get 5% of extra Bonus : "+sallary+(sallary*5/100));
		}
		else
		{
			System.out.println("Thak you for giving a hardwork for Organasasion you are not elisible for bonus : "+sallary);
		}
		
		
		
	}

}
