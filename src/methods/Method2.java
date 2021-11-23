package methods;
class Hospital{
	void doctors() {
		System.out.println("1.DrRob 2.DrJennifer 3.DrTom 4.DrZak");
	}
	void takeAppointment(String appointment) {
		System.out.println("Appointment is scheduled with "+appointment);
	}
	String doctorVisit() {
		return "Dr.Rob";
	}
	String payFees(int amount) {
		System.out.println("Fees is "+amount);
		return "Paid";
	}
}
public class Method2 {

	public static void main(String[] args) {
		Hospital baylor=new Hospital();
		baylor.doctors();
		baylor.takeAppointment("Dr.Rob");
		String office=baylor.doctorVisit();
		System.out.println("Visit at hospital with "+baylor.doctorVisit());
		System.out.println("Account is "+baylor.payFees(450));
	}
}
