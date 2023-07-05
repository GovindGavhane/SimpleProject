package patten;

public class Pattern16 {
	
	public static void main(String[] args) {
		
		 int [] a = {6,8,7,9,5,4,3,2,1};
		 int i=0;
		 while(a.length>i)
		 {
			 int j=i;
			 while(j<a.length)
			 {
				 System.out.print(a[j]+" ");
				 j++;
			 }
			 i++;
			 System.out.println();
		 }
	}

}
