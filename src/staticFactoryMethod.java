abstract class Car3{
	
	abstract void cost(); //abstract methods
	abstract void mileage();
	
	void start() { // concrete methods
		System.out.println("Starts with key");
	}
}
class Audi3 extends Car3{
	void cost() {
		System.out.println("Audi1 cost is 50lakhs");
	}
	void mileage() {
		System.out.println("Audi1 mileage is 15kms");
	}
}
class Bmw3 extends Car3{
	void cost() {
		System.out.println("Bmw2 cost is 40lakhs");
	}
	void mileage() {
		System.out.println("Bmw2 mileage is 10kms");
	}
}
 class CarFactory1{
	 static Car3 getCarObject(String carName) {
		 if(carName.contentEquals("Audi"))
			 return new Audi3();
		 else if(carName.contentEquals("Bmw"))
			 return new Bmw3();
		 else 
			 return null;
	 }
 }

public class staticFactoryMethod {

	public static void main(String[] args) {
	
		Car3 x=CarFactory1.getCarObject("Audi");
		x.cost();
		x.start();
		x.mileage();
	}
}