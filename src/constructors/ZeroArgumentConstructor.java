package constructors;
class Employee1{
	int employee_id;
	double employee_salary;
	
	Employee1 (){
		employee_id=1023;
		employee_salary=65000.0;
	}
	void display() {
		System.out.println("Employee id="+employee_id);
		System.out.println("Employee_salary="+employee_salary);
	}
}
public class ZeroArgumentConstructor {

	public static void main(String[] args) {
		Employee1 john=new Employee1();
		john.display();
	}
}
