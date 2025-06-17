package dummy;

public class Rev_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=4321;
		int revNum=0;
		
		while(num !=0) {
		Integer remainder =	num%10;
		revNum=revNum*10+remainder;
		num=num/10;
			
		}
System.out.print(revNum);
		
	}

}
