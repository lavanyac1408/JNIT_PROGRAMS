package abstractMethod;
abstract class Car4{
	void start() {
		System.out.println("Starts with key");
	}
	void AC() {
		System.out.println("Is Airconditioned");
	}
}
class Audi4 extends Car4{
}
class Bmw4 extends Car4{
}
public class AbstractMethodwithconcerteclass {

	public static void main(String[] args) {
		Car4 x;
		x=new Audi4();
		x.start();
		x.AC();
		x=new Bmw4();
		x.start();
		x.AC();
	}

}
