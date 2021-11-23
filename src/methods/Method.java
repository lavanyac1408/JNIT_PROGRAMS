package methods;
class Restaurant{
	void menu() {
		System.out.println("1.Idly 2.Dosa 3.Wada 4.Poori");
	}
	void takeorder(String order) {
		System.out.println("Order given is "+order);
	}
	String serveFood() {
		return "Dosa";
	}
	String paybill(int amount) {
		System.out.println("Amount given is "+amount);
		return "Paid";
	}
}
public class Method {

	public static void main(String[] args) {
		Restaurant ohris=new Restaurant();
		ohris.menu();
		ohris.takeorder("Dosa");
		System.out.println("Food serve is "+ohris.serveFood());
		System.out.println("Amount given and Bill "+ohris.paybill(234));
	}
}
