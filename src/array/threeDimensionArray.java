package array;

public class threeDimensionArray {

	public static void main(String[] args) {
		int scores [][][]  = {
				{{75,87,69},{90,87,85},{56,67,76}},
				{{78,67,75},{85,98,76},{67,56,66}},
				{{72,63,72},{82,91,71},{64,56,66}},  
				};
		
		for (int i = 0; i < 3; i++)
		{
		for (int j = 0; j < 3; j++)
		{
		for (int k = 0; k < 3; k++)
			System.out.println(scores[i][j][k]);
		}
	}
  }
}
