package innerclass;
class Organisation{
	void notice() {
		System.out.println("Annual General Meeting will be held on 30 Nov");
	    FinanceDept Team=new FinanceDept();
	    Team.prepareFinancialStatement();
	}
	class FinanceDept{
		void prepareFinancialStatement() {
			System.out.println("Financial Statement to be presented to management on or before 15 Nov");
		}
	}
}
public class Nestedinnerclass1 {

	public static void main(String[] args) {
		Organisation Jio=new Organisation();
		Jio.notice();
	}

}
