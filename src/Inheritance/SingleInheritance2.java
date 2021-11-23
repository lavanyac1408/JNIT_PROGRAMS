package Inheritance;
class Doctor1{
	void treatPatient() {
		System.out.println("examines and treats patients");
	}
}
class Cardiologist extends Doctor1{
	void conductEcg() {
	System.out.println("conducts Ecg");
	}
}
public class SingleInheritance2 {

	public static void main(String[] args) {
	Cardiologist Rob=new Cardiologist();
	Rob.treatPatient();
	Rob.conductEcg();
	}
}
