package Arrays;

public class BinaryToDecimal {
	
	public static void main(String[] args) {
		
		
		int binary= 111001;
		int decimal=0;
		int n=0;
		while(binary>0)
		{
			int temp = binary%10;
			decimal+=temp*Math.pow(2, n);
			binary/=10;
			n++;
		}
		System.out.println(decimal);
		
	}
	
	

}
