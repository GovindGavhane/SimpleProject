package patten;

public class Pattern33 {
	
	public static void main(String[] args) {
		int k=2;
		for(int i=1;i<=4;i++)
		{
			int t=k;
			for(int j=1;j<=i;j++)
			{
				System.out.print(t);
				t++; 
			}
			k = k + i;
			System.out.println();
		}
		
		int k1=8;
		for(int i=3;i>=0;i--)
		{
			int t1 = k1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(t1);
				t1++;
			}
			k1 = k1 -i;
			System.out.println();
		}
		
	}

}
