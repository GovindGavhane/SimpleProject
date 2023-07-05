package patten;

public class Pattern27 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			for(int p=4;p>=i;p--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=3;i>=1;i--)
		{
			for(int p=4;p>=i;p--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
