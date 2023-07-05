package Arrays;

public class DuplicateArray {
	
	public static void main(String[] args) {
		
		int [] a = {1,2,2,3,4,5,6,6,1,3};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			  if(a[i]==a[j])
			  {
				  a[j]=0;
			  }
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
		
	}

}
