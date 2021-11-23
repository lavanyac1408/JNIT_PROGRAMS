package operators;

public class Operators {

	public static void main(String[] args) {
		int a = 10; 
		int b = 5;
		int c = 50;
		
			System.out.println("a * b ="+(a*b)); //arithmetic operator multiplication
			
			System.out.println("a + b ="+(a+b)); //arithmetic operator addition
			
			System.out.println("a - b ="+(a-b)); //arithmetic operator subtraction
			
			System.out.println("a / b ="+(a/b)); //arithmetic operator division
			
			System.out.println("a % b ="+(a%b)); //arithmetic operator modulas
			
			System.out.println("a * b /2 ="+(a*b/2)); //arithmetic two different operators
			
			System.out.println("a++ ="+(a++));  //unary operator ++
			
			System.out.println("a-- ="+(a--));  //unary operator --
			
			System.out.println("a < b && a < c="+(a<b&&a<c)); // logical operator && //false && true = false
			
			System.out.println("a < b & a < c="+(a<b&a<c)); // bitwise operator & //false & true = false
			
	}

}
