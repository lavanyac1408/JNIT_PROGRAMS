package whileLoop;
import java.util.Scanner;

public class WhileLoopWithCubeRoot {
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int i=1;

        while (i<=num){
            System.out.println("Number is : "+i+" and cube of "+i+" is : "+(i*i*i));
            i++;
        }
    }
}