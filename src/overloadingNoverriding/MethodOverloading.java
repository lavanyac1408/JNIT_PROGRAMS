package overloadingNoverriding;
class Restuarant {
	void takeOrder(String order) {
	System.out.println("Order given is "+order);
}
	void takeOrder(String order, String order1) {
	System.out.println("Order given is "+order+" and "+order1);
}
	void takeOrder(String order, int sno) {
	System.out.println("Order given is "+order+" and "+sno);
}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Restuarant ohris=new Restuarant();
		ohris.takeOrder("Idly");
		ohris.takeOrder("Dosa",3);
		ohris.takeOrder("Poori","Dosa");
	}
}

