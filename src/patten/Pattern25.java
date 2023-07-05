package patten;

public class Pattern25 {
	
	public static void main(String[] args) {
		
		for(int i=4;i>=1;i--)
		{
			for(int p=4;p>=i;p--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				if(i==3 && (j==2||j==3||j==4) || i==2 && j==2)
					System.out.print(" ");
				else
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
