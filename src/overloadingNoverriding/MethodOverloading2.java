package overloadingNoverriding;
class Hospital1 {

	void doctors(String doctor1, String doctor2, String doctor3) {
		System.out.println("Available doctors are "+doctor1+", "+doctor2+" and "+doctor3);
	}
	void doctors(String doctor1, int doctorid, String date) {
		System.out.println("The doctor available is "+doctor1+" with doctor id " +doctorid+" on "+date);
	}
	void doctors(int doctor1, int fees) {
		System.out.println("Doctor no "+doctor1+" Fees is "+fees);
	}
	}

public class MethodOverloading2 {

	public static void main(String[] args) {
		Hospital1 baylor=new Hospital1();
		baylor.doctors("DrRob","DrJennifer","DrTom");
		baylor.doctors("DrRob",10250,"10/04/2021");
		baylor.doctors(01,500);
	}
}
