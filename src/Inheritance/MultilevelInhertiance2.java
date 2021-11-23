package Inheritance;
class Electronics1{
	void technology() {
		System.out.println("LTE");
	}
}
class Mobile extends Electronics1{
	void battery() {
		System.out.println("Li-Ion 2900mah battery");
	}
}
class Apple extends Mobile{
	void memory() {
		System.out.println("Apple 10 plus memory is 256gb");
	}
	void camera() {
		System.out.println("Apple 10 plus camera is 13MP");
	}
}
public class MultilevelInhertiance2 {

	public static void main(String[] args) {
		Apple plus=new Apple();
		plus.technology();
		plus.battery();
		plus.memory();
		plus.camera();
	}
}