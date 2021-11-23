package switchCase;

public class Switchcase {

	public static void main(String[] args) {
		
		int choice=3;

		switch (choice) {
		case 1 :
			System.out.println("1. Learning JAVA");
			break;
		case 2 :
			System.out.println("2. Learning React");
			break;
		case 3:
			System.out.println("3. Learning AWS");
			break;
		default:
			System.out.println("Wrong Choice entered");
		}
	}

}
