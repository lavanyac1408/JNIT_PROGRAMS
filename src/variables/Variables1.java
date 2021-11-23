package variables;
class Patient{
	byte age;
	short patientID;
	int weight;
	long phoneNumber;
	float height;
	double bmi;
	char myResult;
	boolean isThisYourFirstVisit;
	static String Doctor;
}
class Doctor{
	short licensenumber;
	int noOfPatients;
}

public class Variables1 {

	public static void main(String[] args) {
		Patient rahul=new Patient();
		rahul.age=21;
		rahul.patientID=4502;
		rahul.weight=65;
		rahul.phoneNumber=1234567899;
		rahul.height=5.6f;
		rahul.bmi=26.23d;
		rahul.myResult='P';
		rahul.isThisYourFirstVisit= true;
		Patient.Doctor="Dr Hari";
		System.out.println("age="+rahul.age);
		System.out.println("patientID="+rahul.patientID);
		System.out.println("weight="+rahul.weight);
		System.out.println("phoneNumber="+rahul.phoneNumber);
		System.out.println("bmi="+rahul.bmi);
		System.out.println("myResult"+rahul.myResult);
		System.out.println("isThisYourFirstVisit="+rahul.isThisYourFirstVisit);
		System.out.println("weight="+rahul.weight);
		System.out.println("Doctor="+Patient.Doctor);

	
		Doctor rob=new Doctor();
		rob.licensenumber=13456;
		rob.noOfPatients=50;
		System.out.println("licensenumber="+rob.licensenumber);
		System.out.println("noOfPatients="+rob.noOfPatients);
	}
}
