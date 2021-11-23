package abstractMethod;
abstract class Employee4 {
	abstract void salary();
	void works() {	
	System.out.println("works for an organisation");
	}
}
class Manager1 extends Employee4{
	void salary() {
		System.out.println("Salary of Manager is 6000 dollars");
	}
}
class Clerk1 extends Employee4{
	void salary() {
		System.out.println("Salary of Clerk is 2000 dollars");
	}
}
public class AbstractMethod1 {

	public static void main(String[] args) {
		Employee4 x;
		x=new Manager1();
		x.salary();
		x.works();
		x=new Clerk1();
		x.salary();
		x.works();
	}

}