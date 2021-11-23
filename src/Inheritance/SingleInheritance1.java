package Inheritance;
class Faculty{
	int a=3000;
	void salary() {
		System.out.println("Salary for all faculty is "+a);
	}
}
class ScienceFaculty extends Faculty{
	int b=2000;
	void bonus() {
		System.out.println("Bonus & Salary for ScienceFaculty is "+(a+b));
	}
}
public class SingleInheritance1 {

	public static void main(String[] args) {
		ScienceFaculty rob=new ScienceFaculty();
		rob.salary();
		rob.bonus();

	}

}
