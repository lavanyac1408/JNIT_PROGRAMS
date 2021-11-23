package abstractMethod;
abstract class BankAccount2{
	abstract void deposit();
	abstract void withdraw();
	void governs() {
		System.out.println("Governed by Federal Reserve Bank");
	}
}
class SavingsAccount2 extends BankAccount2{
	void deposit() {
		System.out.println("Savings account holders can deposit with minimum 10 dollars");
	}
	void withdraw() {
		System.out.println("Savings account holders can withdraw with minimum 100 dollars");
	}
}
class CheckingsAccount2 extends BankAccount2{
	void deposit() {
		System.out.println("Checking account holders can deposit with minimum 100 dollars");
	}
	void withdraw() {
		System.out.println("Checkings account holders can withdraw with minimum 200 dollars");
	}
}
public class AbstractMethod2 {

	public static void main(String[] args) {
		BankAccount2 x;
			x=new SavingsAccount2();
			x.governs();
			x.deposit();
			x.withdraw();
			x=new CheckingsAccount2();
			x.governs();
			x.deposit();
			x.withdraw();
	}
}
