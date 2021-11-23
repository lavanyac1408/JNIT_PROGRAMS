package Inheritance;
import java.util.Scanner;

class Square {
	int a; 
Scanner n=new Scanner(System.in);	
	void input() {
		System.out.println("Enter a value");
		a=n.nextInt();
	}
	void sqr() {	
		System.out.println("Square="+(a*a));
	}
	}
class Sum extends Square{
	int b;
	void accept() {
		System.out.println("Enter b value");
		b=n.nextInt();
	}
	void add() {
		System.out.println("Sum="+(a+b));
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Sum x=new Sum();
		x.input();
		x.sqr();
		x.input();
		x.accept();
		x.add();
	}
}
