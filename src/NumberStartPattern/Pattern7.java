package NumberStartPattern;

public class Pattern7 {
	
	public static void main(String[] args) {
		
		 int k=1;
		 for(int i=0;i<4;i++)
		 {
			 int t=0;
			 for(int j=0;j<=i;j++)
			 {
				 System.out.print(k++);
				 if(t<i)
				 {
					 System.out.print("*");
					 t++;
				 }
			 }
			 System.out.println();
		 }
	}

}
/*   1
     2*3
     4*5*6
     7*8*9*10 */
