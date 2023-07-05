package patten;

public class Pattern26 {
	
	public static void main(String[] args) {
		
		 
		for(int i=1;i<=4;i++)
		 {
			for(int p=4;p>i;p--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
	    	}
		   for(int i=1;i<=3;i++)
		   {
			   for(int p=1;p<=i;p++)
			   {
				   System.out.print(" ");
			   }
			for(int j=3;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
