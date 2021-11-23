package interfaces;
interface Vehicle1{
	public void cost();
	public void milage();
 }
abstract class Car3 implements Vehicle1{
	public void vipers() {
		System.out.println("Vehicle has vipers");
	}
	abstract void airbags();
}
class Audi3 extends Car3{
	public void cost() {
		System.out.println("Cost of Audi3 is $60,000");
	}
	public void milage() {
		System.out.println("Audi3 mileage is 24 miles");
	}
	void airbags() {
		System.out.println("Audi has 6 airbags");
	}
}
class Bmw3 extends Car3{
	public void cost() {
		System.out.println("Cost of Bmw3 is $50,000");
	}
	public void milage() {
		System.out.println("Bmw3 mileage is 22 miles");
	}
	public void airbags() {
		System.out.println("Bmw3 has 5 airbags");
	}
}
abstract class Bike implements Vehicle1{
	void stand() {
		System.out.println("All Bikes have stand support");
	}
}
class Apache extends Bike{
	public void cost() {
		System.out.println("Cost of Apache is $15,000");
	}
	public void milage() {
		System.out.println("Apache mileage is 60 miles");
	}
}
class Fz extends Bike{
	public void cost() {
		System.out.println("Cost of Fz is $20,000");
	}
	public void milage() {
		System.out.println("Apache mileage is 50 miles");
	}
}
public class Interface {

	public static void main(String[] args) {
		Audi3 a=new Audi3();
		a.cost();
		a.milage();
		a.airbags();
		a.vipers();
		Bmw3 b=new Bmw3();
		b.cost();
		b.milage();
		b.airbags();
		b.vipers();
		Apache my=new Apache();
		my.cost();
		my.milage();
		my.stand();
		Fz Ferrari=new Fz();
		Ferrari.cost();
		Ferrari.milage();
		Ferrari.stand();
	}
}
