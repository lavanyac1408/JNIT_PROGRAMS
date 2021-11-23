package variables;
class Product{
	short itemId;
	float weight;
	double price;
}
class Vehicle{
	int numberOfWheels;
	double price;
}

public class Variables2 {
	
	public static void main(String[] args) {
		Product apple=new Product();
		apple.itemId=12345;
		apple.weight=1.5f;
		apple.price=23.56d;
		System.out.println("itemId="+apple.itemId);
		System.out.println("weight="+apple.weight);
		System.out.println("price="+apple.price);

		Vehicle car=new Vehicle();
		car.numberOfWheels=4;
		car.price=45.50d;
		System.out.println("numberOfWheels="+car.numberOfWheels);
		System.out.println("price="+car.price);  
	}
}
