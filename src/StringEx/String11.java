package StringEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class String11 {
	
	public static void main(String[] args)throws Exception {
		
		 BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the String");
		 String s = r.readLine();
		 String [] s1 = s.split("[ ]");
		 HashMap<String,Integer> map = new HashMap<String,Integer>();
		 for(int i=0;i<s1.length;i++)
		 {
			 if(map.containsKey(s1[i]))
			 {
				 int count = map.get(s1[i]);
				 map.put(s1[i], count+1);
			 }
			 else
			 {
				 map.put(s1[i], 1);
			 }
		 }
		 System.out.println(map);
		 
		 
		 
	}

}
