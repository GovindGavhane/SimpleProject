package NumberStartPattern;

public class Pattern1 {
	
	public static void main(String[] args) {
		
		int k=1;
		for(int i=1;i<=4;i++)
		{
			int t=0;
			for(int j=1;j<=4;j++)
			{
				System.out.print(k++);
				if(t<3)
				{
				System.out.print("*");
				t++;
				}
			}
			System.out.println();
		}
	}

}
