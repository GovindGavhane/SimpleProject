package NumberStartPattern;

public class Pattern2 {
	
	public static void main(String[] args) {
		
		int k=13;
		
		for(int i=4;i>=1;i--)
		{
			int t=0;
			for(int j=4;j>=1;j--)
			{
				 
				System.out.print(k++);
				if(t<3)
				{
					System.out.print("*");
					t++;
				}
				
				
			}
			k = k -8;
			System.out.println();
		}
	}

}
