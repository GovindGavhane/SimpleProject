package Arrays;

import java.util.Arrays;

public class DuplicateArray2 {
	
	
	static int [] a = {1,3,0,0,4,5,6,1,1,0,2};
	
	public static void main(String[] args) {
		
		Arrays.sort(a);
		
		boolean [] b = new boolean[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=true;
		}
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					b[j]=false;
			}
		}
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==true)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

}
