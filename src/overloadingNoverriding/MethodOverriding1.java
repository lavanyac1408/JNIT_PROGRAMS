package overloadingNoverriding;
class Employee3 {
	void salary() {
		System.out.println("No salary");
	}
}
class Manager extends Employee3{
	void salary() {
		System.out.println("Salary of Manager is 6000 dollars");
	}
}
class Clerk extends Employee3{
	void salary() {
		System.out.println("Salary of Clerk is 2000 dollars");
	}
}
public class MethodOverriding1 {

	public static void main(String[] args) {
		Employee3 x=new Employee3();
		x.salary();
		x=new Manager();
		x.salary();
		x=new Clerk();
		x.salary();
	}

}
