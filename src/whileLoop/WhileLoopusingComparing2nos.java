package whileLoop;

public class WhileLoopusingComparing2nos {

	public static void main(String[] args) {
		int large =2345;
		int small =3;
		
		while(large>small) {
			System.out.println("Large = "+ large+ " and " + "Small = " +small);
			large = large /2;
			small =small *2;
			
		}

	}

}
