package StringEx;

public class Ex1 {
	
	public static void main(String[] args) {
		
		 String s = "Govind Gavhane";
		 
		 for(int i=0;i<s.length();i++)
		 {
			 char ch = s.charAt(i);
			 if((ch=='a' || ch=='i' || ch=='o' || ch=='u'|| ch=='e')||(ch=='A' || ch=='I' || ch=='O' || ch=='U'|| ch=='E'))
			 {
				System.out.println("vovel :"+ch); 
			 }
			 else
			 {
				 System.out.println("Conzonent :"+ch);
			 }
		 }
	}

}
