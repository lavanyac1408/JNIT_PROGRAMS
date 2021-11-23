package ifElseStatement;

public class NestedIfElseStatement {

	public static void main(String[] args) {
		int a=500;
		if (a>0) {
			if(a>1000)
				System.out.println("a is +ve and is >1000");
			else
				System.out.println("a is +ve and a is <1000");
		}
		else {
			System.out.println("a is negative");
		}
		

	}

}
