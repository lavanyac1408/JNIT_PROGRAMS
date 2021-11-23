package switchCase;

public class Switchcase1 {

	public static void main(String[] args) {
		int subject=5;

		switch (subject) {
		case 1 :
			System.out.println("1.English");
			break;
		case 2 :
			System.out.println("2.Hindi");
			break;
		case 3:
			System.out.println("3.Marathi");
			break;
		case 4:
			System.out.println("4.Science");
			break;
		default:
			System.out.println("Wrong subject selected");
		}
	}
}