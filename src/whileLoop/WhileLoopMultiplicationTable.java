package whileLoop;

public class WhileLoopMultiplicationTable {

	public static void main(String[] args) {
		int n=5,i=1,multiply=5;
		while(i<=10) {
			multiply=n*i;
			
			System.out.println( n +"*" + i + "=" + multiply);
			i++;
			}
		
		}
}