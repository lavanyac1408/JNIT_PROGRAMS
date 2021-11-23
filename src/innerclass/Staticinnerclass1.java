package innerclass;

class Organisation2{
	
	static class Preparation{
		void prepareFinancialStatement() {
			System.out.println("Finance Team to prepare & submit Financial Statement before 15 Nov");
		}
		static void notice() {
			System.out.println("Annual General Meeting will be held on 30 Nov");
	}
    
 }
}
public class Staticinnerclass1 {

	public static void main(String[] args) {
		Organisation2.Preparation Team=new Organisation2.Preparation();
		Team.prepareFinancialStatement();
		Organisation2.Preparation.notice();
		
	}

}
