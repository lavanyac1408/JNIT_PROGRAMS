package thisNsuper;
class Employee5{
	int employee5_id;
	double employee5_salary;
	
	Employee5 (int employee5_id, double employee5_salary){
		this.employee5_id=employee5_id;
		this.employee5_salary=employee5_salary;
	}
	void display() {
		System.out.println("Employee id="+employee5_id);
		System.out.println("Employee_salary="+employee5_salary);
	}
}
public class thiskeyword {
	
	public static void main(String[] args) {
		Employee5 john=new Employee5(1023,65000.0);
		john.display();
		Employee5 bob=new Employee5(1024,45000.0);
		bob.display();
	}
}
