package array;

public class twoDimensionArray {

	public static void main(String[] args) {
		//declaration & intialisation
		int number [] []  = {
				{1,2,3},
				{4,5,6},
				{7,8,9},	};
		
		String names [] []  = {
				{"Rob1","Rob2","Rob3"},
				{"Rob4","Rob5","Rob6"},
				{"Rob7","Rob8","Rob9"},   };
		//accessing array
		for (int i = 0; i < 3; i++)
		{
		for (int j = 0; j < 3; j++)
		{
		System.out.println(number [i][j]);
		System.out.println(names[i][j]);
	}
   }
  }
}	