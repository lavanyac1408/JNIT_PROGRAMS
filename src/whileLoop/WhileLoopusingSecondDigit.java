package whileLoop;

public class WhileLoopusingSecondDigit {

	public static void main(String[] args) {
		
		int n =456373;
		int sum =0;
		
		int ldigit = n%100;  //R73
		int sldigit = ldigit/10;   //Q7
		
		while(n>99) {
		int fdigit =n%100;       //Q45  fdigit
		n =n/10;                // 5 fsdigit
			}
		
		n = n%10;
		sum = sldigit+n;
		System.out.println("Sum ="+sum);
	}

}
