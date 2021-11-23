package runtimeException;

public class StringIndexOutOfBoundException {

	public static void main(String[] args) {
		try {
			String bgbk = "beginnersbooks";
				System.out.println(bgbk.length());
			char c = bgbk.charAt(0);
			c = bgbk.charAt(40);
				System.out.println(c);
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException !");
		}

	}

}
