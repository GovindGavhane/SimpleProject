package patten;

public class Pattern5 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int p=1;p<=i;p++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++)
			{
				if(j==i)
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
