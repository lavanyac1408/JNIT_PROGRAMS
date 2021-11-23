package overloadingNoverriding;
class Car1{
	void cost() {
		System.out.println("No cost");
	}
	void mileage() {
		System.out.println("No mileage");
	}
}
class Audi1 extends Car1{
	void cost() {
		System.out.println("Audi1 cost is 50lakhs");
	}
	void mileage() {
		System.out.println("Audi1 mileage is 15kms");
	}
}
class Bmw extends Car1{
	void cost() {
		System.out.println("Bmw cost is 40lakhs");
	}
	void mileage() {
		System.out.println("Bmw mileage is 10kms");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Car1 x=new Car1();
		x.cost();
		x.mileage();
		x=new Audi1();
		x.cost();
		x.mileage();
		x=new Bmw();
		x.cost();
		x.mileage();
	}
}
