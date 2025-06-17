package Intrive;

public class Rev_String {
	
	public static void main(String args[]) {
		
		String word ="java";
		String rev="";
		
		for(int i=0;i<word.length();i++) {
		
		
		rev=word.charAt(i)+rev;
		
	}

	System.out.print(rev);
}
	
}
 