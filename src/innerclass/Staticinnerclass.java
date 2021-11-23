package innerclass;

class University4{
	
static class Department{
	void announcement() {
		System.out.println("Correction will start in ten days");
	}
	static void result() {
		System.out.println("10th Nov is result day");
	}
   }
 }

public class Staticinnerclass {

	public static void main(String[] args) {
		University4.Department cse=new University4.Department();
		cse.announcement();
		University4.Department.result();
	}

}
