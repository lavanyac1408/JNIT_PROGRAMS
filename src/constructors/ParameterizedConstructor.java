package constructors;
class Employee2 {
	int employee2_id;
	double employee2_salary;

	Employee2 (int x, double y){
		employee2_id=x;
		employee2_salary=y;
	}
	void display() {
		System.out.println("Employee2 id="+employee2_id);
		System.out.println("Employee2_salary="+employee2_salary);	
	}
	
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		Employee2 john=new Employee2(1023,65000.0);
		john.display();
		Employee2 bob=new Employee2(1024,45000.0);
		bob.display();
	}
}
