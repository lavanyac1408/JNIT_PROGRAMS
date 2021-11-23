package variables;
class Student{
	int age;
	float height;
	static String clg;
}
class Employee{
	int eid;
	float salary;
	static String company;
}

public class Variables {

	public static void main(String[] args) {
		Student rahul=new Student();
		rahul.age=21;
		rahul.height=5.6f;
		Student.clg="CMR";
		System.out.println("age="+rahul.age);
		System.out.println("height="+rahul.height);
		System.out.println("clg="+Student.clg);
		
		Employee shiva=new Employee();
		shiva.eid=1023;
		shiva.salary=5000.45f;
		Employee.company="Infosys";
		System.out.println("eid="+shiva.eid);
		System.out.println("salary="+shiva.salary);
		System.out.println("company="+Employee.company);
	}
}
