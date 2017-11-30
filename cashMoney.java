import java.util.Scanner;

public class cashMoney {

	public static void main(String args[]) {
		
		
		double amt = 23213135.69; //arbitrary amount due
		long num;
		Scanner input = new Scanner(System.in);
		cashPayment first = new cashPayment(amt); //puts the amount due into the other class to manipulate
		
		System.out.printf("The current balance is: $%,.2f",first.getAmount());
		System.out.println();
		
		while(first.getAmount() > 0) {
		
			System.out.println("1. Hundred Dollar Bill's");
			System.out.println("2. Fifty Dollar Bill's");
			System.out.println("3. Twenty Dollar Bill's");
			System.out.println("4. Ten Dollar Bill's");
			System.out.println("5. Five Dollar Bill's");
			System.out.println("6. One Dollar Bill's");
			System.out.println("7. Quarter's");
			System.out.println("8. Dime's");
			System.out.println("9. Nickel's");
			System.out.println("10. Pennies");
			System.out.println("\nPlease select which denomination to enter (1, 2, 3...):");
			//all options to pick as payment
			
			int denomination = input.nextInt();
			
			if(denomination < 1 || denomination > 10) {
				System.out.println("Please enter a valid option: ");
				denomination = input.nextInt();
			}
			
			switch(denomination) {//switch statement to get money from customer 1 bill or coin at a time
			case 1: //$100 input
				System.out.println("How many $100 bills are being entered?");
				num = input.nextLong();
				first.getOneHundred(num);
				if(first.getAmount() > 0) {
					System.out.printf("The remaining balance is %,.2f",first.getAmount());
					System.out.println();
				}
				break;
			case 2: //$50 input
				System.out.println("How many $50 bills are being entered?");
				num = input.nextLong();
				first.getFifty(num);
				if(first.getAmount() > 0) {
					System.out.printf("The remaining balance is %,.2f",first.getAmount());
					System.out.println();
				}
				break;
			case 3://$20 input.
				System.out.println("How many $20 bills are being entered?");
				num = input.nextLong();
				first.getTwenty(num);
				if(first.getAmount() > 0) {
					System.out.printf("The remaining balance is %,.2f",first.getAmount());
					System.out.println();
				}
				break;
			case 4://$10 input
				System.out.println("How many $10 bills are being entered?");
				num = input.nextLong();
				first.getTen(num);
				if(first.getAmount() > 0) {
					System.out.printf("The remaining balance is %,.2f",first.getAmount());
					System.out.println();
				}
				break;
			case 5://$5 input
				System.out.println("How many $5 bills are being entered?");
				num = input.nextLong();
				first.getFive(num);
				if(first.getAmount() > 0) {
					System.out.printf("The remaining balance is %,.2f",first.getAmount());
					System.out.println();
				}
				break;
			case 6://$1 input
				System.out.println("How many $1 bills are being entered?");
				num = input.nextLong();
				first.getOne(num);
				if(first.getAmount() > 0) {
					System.out.printf("The remaining balance is %,.2f",first.getAmount());
					System.out.println();
				}
				break;
			case 7://$0.25 input
				System.out.println("How many quarters are being entered?");
				num = input.nextLong();
				first.getQuarter(num);
				if(first.getAmount() > 0) {
					System.out.printf("The remaining balance is %,.2f",first.getAmount());
					System.out.println();
				}
				break;
			case 8://$0.10 input
				System.out.println("How many dimes are being entered?");
				num = input.nextLong();
				first.getDime(num);
				if(first.getAmount() > 0) {
					System.out.printf("The remaining balance is %,.2f",first.getAmount());
					System.out.println();
				}
				break;
			case 9://$0.05 input
				System.out.println("How many nickels are being entered?");
				num = input.nextLong();
				first.getNickel(num);
				if(first.getAmount() > 0) {
					System.out.printf("The remaining balance is %,.2f",first.getAmount());
					System.out.println();
				}
				break;
			case 10://$0.01 input
				System.out.println("How many pennies are being entered?");
				num = input.nextLong();
				first.getPenny(num);
				if(first.getAmount() > 0) {
					System.out.printf("The remaining balance is %,.2f",first.getAmount());
					System.out.println();
				}
				break;
			}
			
		}
		
		if(first.getAmount() < 0) { //amount to return to the customer as change
			double neg = first.getAmount() * -1; //figure will be negative, so must flip to positive number
			System.out.printf("Your change is $%,.2f. Please collect your change below before leaving.", neg);
		}
			
		
	}
}
