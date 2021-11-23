package whileLoop;

public class WhileLoopusingF_Digit {

	public static void main(String[] args) {
		
		int n=4852; 
		int sum=0;
		
		int last_digit =n%10; //2
			
		while (n>9) {
		n=n/10;        //first digit
		sum=last_digit+n;}
		
		System.out.println("Sum="+sum);
		}
	}

