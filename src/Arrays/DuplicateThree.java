package Arrays;

import java.util.HashSet;

public class DuplicateThree {
	
	public static void main(String[] args) {
		
		 int [] a = {1,3,0,0,4,5,6,1,1,0,2};
		 
		 HashSet set = new HashSet();
		 for(int i=0;i<a.length;i++)
		 {
			 set.add(a[i]);
		 }
		 System.out.print(set);
	}

}
