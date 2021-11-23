abstract class Car2{
	
	abstract void cost(); //abstract methods
	abstract void mileage();
	
	void start() { // concrete methods
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
 class CarFactory {
	 Car2 getCarObject(String carName) {
		 if(carName.contentEquals("Audi"))
			 return new Audi2();
		 else if(carName.contentEquals("Bmw"))
			 return new Bmw2();
		 else 
			 return null;
	 }
 }

public class instanceFactoryMethod {

	public static void main(String[] args) {
		CarFactory cf=new CarFactory();
		Car2 x=cf.getCarObject("Audi");
		x.cost();
		x.start();
		x.mileage();
	}
}