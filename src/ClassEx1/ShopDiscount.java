package ClassEx1;

import java.io.*; 

public class ShopDiscount {
	
	public static void main(String[] args)throws Exception {
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Quantity");
		int Quantity = Integer.parseInt(r.readLine());
		int [] arr = new int[Quantity];
		System.out.println("Enter the price");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(r.readLine());
		}
		int bill=0;
		for(int a : arr)
		{
			bill = bill + a;
		}
		if(bill>1000)
		{
			System.out.println("You will get 10% of Discount : \n You bill is : "+(bill-(bill*10/100)));
		}
		else
		{
			System.out.println("You are not elisible for Discount : \n You bill is : "+bill);
		}
		
	}

}
