package patten;

public class Pattern6 {

	public static void main(String[] args) {
		
		for(int i=5;i>=1;i--)
		{
			for(int p=1;p<=i;p++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>=1;j--)
			{
				if(j==i)
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
