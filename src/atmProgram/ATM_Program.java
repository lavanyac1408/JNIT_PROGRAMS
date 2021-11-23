package atmProgram;
import java.util.Scanner;
public class ATM_Program {
		static float balance = 100000;

		public static void main(String[] args) {
			int choice = 0;
			System.out.println("Welcome to Chase Bank - Dallas");
			
			do {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("1. Withdraw ");
				System.out.println("2. Deposit");
				System.out.println("3. Check Balance");
				System.out.println("4. Exit");
				System.out.println("----------------Please select an option:---------------------");
				choice = sc.nextInt();
				
				switch (choice) {
				case 1:
					long amount;
					System.out.println("Please enter amount to withdraw.");
					amount = sc.nextLong();

					if (amount > balance || amount == 0) {
						System.out.println("You have a insufficient balance \n\n");
					} else {
						balance = balance - amount;
						System.out.println(
							"You have withdrawn " + amount + " and your new balance is now. " + balance + "\n");
					}
					break;
				
				case 2:
					long deposit;
					System.out.println("Please enter the amount you would like to deposit: ");
					deposit = sc.nextLong();
					
					balance = deposit + balance;
					System.out.println("You have deposited " + deposit + " new balance is. " + balance + "\n");
					
					break;
				
				case 3:
					System.out.println("Your balance is " + balance + "\n");
					break;
				
				default:
					System.out.println(" Thank you for banking with Chase Bank - Dallas. Exiting\n\n");
				}
				
			} while (choice != 4);

		}
	}