package innerclass;
class University2{
	void announcement() {
		System.out.println("Exams will start from 1st Nov");
	    Department cse=new Department();
	    cse.prepareQuestions();
	}
	class Department{
		void prepareQuestions() {
			System.out.println("Exam paper will be prepared in ten days");
		}
	}
}
public class Nestedinnerclass {

	public static void main(String[] args) {
		University2 texas=new University2();
		texas.announcement();
	}

}
