package innerclass;

class University3{
	void announcement() {
		System.out.println("Exams will start from 1st Nov");
	
	class Department{
		void prepareQuestions() {
			System.out.println("Exam paper will be prepared in ten days");
		}
	}
	 Department cse=new Department();
	    cse.prepareQuestions();
	}
}

public class Localinnerclass {

	public static void main(String[] args) {
		University3 texas=new University3();
		texas.announcement();
	}

}
