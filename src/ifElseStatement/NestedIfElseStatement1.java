package ifElseStatement;

public class NestedIfElseStatement1 {

	public static void main(String[] args) {
		int age=28;
		int weight=50;
			if (age>=18) {
				if (weight>50) {
					System.out.println("You are eligible to enroll in Defense Academy");
				}
				else {
					System.out.println("You are not eligible to enroll in Defense Academy");
				}
			}else {
					System.out.println("Age must be greater than 18");
				}
			}

	}

