package atmProgram;
import java.util.Scanner;

public class ATM_Program1 {
	static float balance = 100000;  // Balance for everyone

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
			System.out.println("Welcome to Chase Bank - Dallas");
		
		do{
			int choice;
			System.out.println("1. Withdraw ");
	        System.out.println("2. Deposit");
	        System.out.println("3. Balance");
	        System.out.println("---------------------" +
	                "Please select an option: " + 
	                "---------------------");
	        choice = sc.nextInt();
			
	        switch (choice) {
	        case 1:
	        	float amount;
	        		System.out.println("Please enter an amount you would like to withdraw.");
	        	amount = sc.nextFloat();
	        	
	        	if (amount>balance || amount ==0) {
	        		System.out.println("You have a insufficient with your funds\n\n");
	        		
	        	} else {
	        		balance = balance - amount;  //If they have money, update balance
	        		System.out.println("You have withdrawn " + amount + " and your new balance is now. " + balance + "\n");
	        		
	        	}
	        	break;
	        
	        case 2:
	        	float deposit;
	        		System.out.println("Please enter the amount you would like to put in: ");
	                deposit = sc.nextFloat();
	                
	                balance = deposit + balance; //update balance
	        		System.out.println("You have deposited " + deposit + " new balance is. " + balance + "\n");
	              
	            break;
	        
	        case 3:
	        	System.out.println("Your balance is " + balance + "\n");
               
                break;
	        
	        case 4:
	        	int anotherTransaction;
	        		System.out.println("Do you want another transaction? \n\nPress 1 for anotherTransaction \n2 To exit.");
	                anotherTransaction = sc.nextInt();
	            
	            if (anotherTransaction ==1) {
	            	
	            } else if (anotherTransaction ==2) {
	            	System.out.println("Thank you for banking with Chase Bank!");
	            	
	            } else {
	                System.out.println("Invalid choice \n\n");
         	            }

		 while (choice !=5);
		}
	
		

