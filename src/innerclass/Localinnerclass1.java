package innerclass;

class Organisation1{
	void notice() {
		System.out.println("Annual General Meeting will be held on 30 Nov");

	class FinanceDept{
		void prepareFinancialStatement() {
			System.out.println("Financial Statement to be presented to management on or before 15 Nov");
		}
	}
    FinanceDept team=new FinanceDept();
    team.prepareFinancialStatement();
 }
}
public class Localinnerclass1 {

	public static void main(String[] args) {
		Organisation1 Jio=new Organisation1();
		Jio.notice();
	}

}
