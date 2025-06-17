package DubC;

public class String {
	
	public static void main(String args[]) {
		
		java.lang.String word ="java";
		java.lang.String rev="";
		for(int i=0;i<word.length();i++) {
		rev=word.charAt(i)+rev;	
		
		}
	
	System.out.print(rev);
	}

}
