package Inheritance;
class Bankaccount{
	void deposit() {
		System.out.println("one can deposit");
	}
	void withdraw() {
		System.out.println("one can withdraw");
	}
}
class Savings extends Bankaccount{
	void savingsfeature() {
		System.out.println("Savings account is for savings");
	}
}
class Checkings extends Bankaccount{
	void checkingsfeature() {
		System.out.println("Checkings account is a salary account");
	}
}
public class HierarchicalInheritance1 {

	public static void main(String[] args) {
		Savings a=new Savings();
		a.savingsfeature();
		a.deposit();
		a.withdraw();
		Checkings b=new Checkings();
		b.checkingsfeature();
		b.deposit();
		b.withdraw();
	}
}
