package abstractMethod;
abstract class Car2{
	abstract void cost();
	abstract void mileage();
	
	void start() {
		System.out.println("Starts with key");
	}
}
class Audi2 extends Car2{
	void cost() {
		System.out.println("Audi1 cost is 50lakhs");
	}
	void mileage() {
		System.out.println("Audi1 mileage is 15kms");
	}
}
class Bmw2 extends Car2{
	void cost() {
		System.out.println("Bmw2 cost is 40lakhs");
	}
	void mileage() {
		System.out.println("Bmw2 mileage is 10kms");
	}
}

public class AbstractMethod {

	public static void main(String[] args) {
		Car2 x;
		x=new Audi2();
		x.start();
		x.cost();
		x.mileage();
		x=new Bmw2();
		x.start();
		x.cost();
		x.mileage();
	}
}