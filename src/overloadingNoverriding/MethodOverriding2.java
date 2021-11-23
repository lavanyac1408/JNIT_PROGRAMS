package overloadingNoverriding;
class BankAccount1{
	void deposit() {
		System.out.println("No deposit");
	}
	void withdraw() {
		System.out.println("No withdraw");
	}
}
class SavingsAccount1 extends BankAccount1{
	void deposit() {
		System.out.println("Savings account holders can deposit with minimum 10 dollars");
	}
	void withdraw() {
		System.out.println("Savings account holders can withdraw with minimum 100 dollars");
	}
}
class CheckingsAccount1 extends BankAccount1{
	void deposit() {
		System.out.println("Checking account holders can deposit with minimum 100 dollars");
	}
	void withdraw() {
		System.out.println("Checkings account holders can withdraw with minimum 200 dollars");
	}
}
public class MethodOverriding2 {

	public static void main(String[] args) {
		BankAccount1 x=new BankAccount1();
			x.deposit();
			x.withdraw();
			x=new SavingsAccount1();
			x.deposit();
			x.withdraw();
			x=new CheckingsAccount1();
			x.deposit();
			x.withdraw();
			
	}

}
