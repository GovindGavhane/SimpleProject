package patten;

import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {
		
		int k=4;
		for(int i=1;i<=4;i++)
		{
			int p=k;
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(--p);
			}
			k = k + 1 + i;
			System.out.println();
		}

		int k1=9;
		for(int i=3;i>=1;i--)
		{
			int p1=k1;
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(--p1);
			}
			k1 = k1  - i;
			System.out.println();
		}
		
	}
}


