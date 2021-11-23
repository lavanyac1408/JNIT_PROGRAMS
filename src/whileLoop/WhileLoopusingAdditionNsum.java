package whileLoop;

public class WhileLoopusingAdditionNsum {

	public static void main(String[] args) {
	int n=5, i=1, sum=0;
	
	while(i<=n) {
		System.out.println(i);
		sum=sum+i;
		i++;
	}
	System.out.println("sum="+sum);
	}

}
