package ifElseStatement;

public class IfElseLadder {

	public static void main(String[] args) {
		int a=100,b=100,c=100;
		if(a>b && a>c)
			System.out.println("a is maximum "+a);
		else if (b>a && b>c)
			System.out.println("b is maximum "+b);
		else if (c>a && c>b)
			System.out.println("c is maxmium "+c);
		else
			System.out.println("All are equal");
	}

}
