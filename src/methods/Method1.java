package methods;
class University {
	void listofcolleges() {
		System.out.println("1.MIT 2.SMU 3.HARVARD");
	}
	void selectcolleges(String college) {
		System.out.println("Selected college is "+college);
	}
	String seatalloted() {
		return "MIT";
	}
	String payFees(int amount) {
		return "Paid";
	}
}
public class Method1 {

	public static void main(String[] args) {
		University texas=new University();
		texas.listofcolleges();
		texas.selectcolleges("MIT");
		String website=texas.seatalloted();
		System.out.println("Seat is alloted in "+texas.seatalloted());
		System.out.println("College fees has been "+texas.payFees(23000));
	}
}
