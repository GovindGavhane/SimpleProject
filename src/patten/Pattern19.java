package patten;

public class Pattern19 {

	public static void main(String[] args) {
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<6;j++)
			{
				if(i==1 || i==2 )
				{
					if(i==1 && j==0 || i==1&&j==5 || i==2 && j==0 || i==2 && j==5)
						System.out.print("*");
					else
						System.out.print(" ");
					
				}else
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
