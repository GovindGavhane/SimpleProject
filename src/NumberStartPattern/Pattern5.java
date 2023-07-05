package NumberStartPattern;

public class Pattern5 {
	
	public static void main(String[] args) {
		
		int k=1,p=9;
		for(int i=1;i<=5;i++)
		{
			int t=0;
			for(int j=1;j<=4;j++)
			{
				if(i==1 || i==5)
				{
					System.out.print(k++);
					if(t<3)
					{
						System.out.print("*");
						t++;
					}
				}
				else
				{
					System.out.print(p++);
					if(t<3)
					{
						System.out.print("*");
						t++;
					}
				}
			}
			System.out.println();
		}
		
	}

}
