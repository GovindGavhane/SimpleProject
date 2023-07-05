package patten;

public class Pattern4 {
	
	public static void main(String[] args) {
		
		 for(int i=5;i>=1;i--)
		 {
			 for(int p=4;p>=i;p--)
			 {
				 System.out.print("  ");
			 }
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
	}

}
