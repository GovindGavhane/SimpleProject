package NumberStartPattern;

public class Pattern6 {
	
	public static void main(String[] args) {
		
		int k=0,p=12, o=16;;
		for(int i=1;i<=4;i++)
		{
			int t=0;
			for(int j=4;j>=1;j--)
			{
				if(i==2 || i==3 || i==4)
				{
					if(p==4)
					{
						
				System.out.print(o--);
					}
					else
				System.out.print(p--);
				
				if(t<3)
				{
					System.out.print("*");
					t++;
				}
				}else
				{
					System.out.print(j*i);
					 
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
