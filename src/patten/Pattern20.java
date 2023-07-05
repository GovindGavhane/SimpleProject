package patten;

public class Pattern20 {
	
	public static void main(String[] args) {
		
		for(int i=0;i<4;i++)
		{
			for(int p=0;p<i;p++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<6;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
