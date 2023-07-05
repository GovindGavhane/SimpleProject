package patten;

public class Pattern34 {
	
	public static void main(String[] args) {
		
		int k=2;
		for(int i=2;i<=5;i++)
		{
			int t=k;
			for(int j=2;j<=i;j++)
			{
				System.out.print(t);
				t--;
			}
			k = k +i;
			System.out.println();
		}
		int k1=11;
		for(int i=4;i>=1;i--)
		{
			int t1=k1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(t1);
				t1--;
			}
			k1 = k1 - i;
			System.out.println();
		}
		
	}
	

}
