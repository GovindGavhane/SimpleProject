package patten;

public class Pattern17 {
	
	public static void main(String[] args) {
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(i==1 && j==1 || i==1 && j==2 || i==2 && j==1 || i==2 && j==2)
					System.out.print(" ");
				else
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
