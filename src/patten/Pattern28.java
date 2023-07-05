package patten;

public class Pattern28 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i==2 && j==2)
					System.out.print(1);
				else if( i==3 && j==2)
					System.out.print(2);
				else
				System.out.print(3);
			}
			System.out.println();
		}
	}

}
