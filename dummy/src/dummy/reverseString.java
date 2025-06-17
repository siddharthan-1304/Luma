package dummy;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="Suryas";
		String res="";
		for(int i=0; i<word.length();i++) {
			res=word.charAt(i) + res;					
		}
		System.out.println(res);
	}

}
