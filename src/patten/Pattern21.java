package patten;

public class Pattern21 {
	
	public static void main(String[] args) {
		
		for(int i=0;i<4;i++)
		{
			for(int p=4;p>i;p--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<4;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
