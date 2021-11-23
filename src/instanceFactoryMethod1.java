
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
class Employee4Factory {
	Employee4 getEmployeeObject(String employeeCadre) {
	if(employeeCadre.contentEquals("Manager1"))	
		return new Manager1();
	else if(employeeCadre.contentEquals("Clerk1"))
		return new Clerk1();
	else
		return null;
	}
}

public class instanceFactoryMethod1 {

	public static void main(String[] args) {
		Employee4Factory ef=new Employee4Factory();
		Employee4 x=ef.getEmployeeObject("Manager1");
		x.salary();
		x.works();
	
	}
}