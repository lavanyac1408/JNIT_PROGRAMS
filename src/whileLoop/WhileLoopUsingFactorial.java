package whileLoop;

public class WhileLoopUsingFactorial {

	public static void main(String[] args) {
		int n=5, i=1, sum=1;
		
		while(i<=n) {
			System.out.println(i);
			sum=sum*i;
			i++;
		}
		System.out.println("factorial="+sum);
		}

	}