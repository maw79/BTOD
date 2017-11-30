import java.util.Random;
import java.util.Scanner;

public class CCMoney {

	public static void main(String args[]) {
		
		String name, CCNum, CVV, zip, type;
		double total = 235.69;
		int start = 1;
		int passOrFail;
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.printf("The current balance is: $%,.2f",total);
		System.out.println();
		
		System.out.println("Is it debit or credit? (enter Debit or Credit)");
		type = input.nextLine();
		System.out.println("What is the name on the card?");
		name = input.nextLine();
		System.out.println("What is the 16 digit card number?");
		CCNum = input.nextLine();
		System.out.println("What is the security code on the back?");
		CVV = input.nextLine();
		System.out.println("What is the billing zipcode?");
		zip = input.nextLine();
		
		
		CCPayment first = new CCPayment(name, CCNum, CVV, zip, type, total);
		
		if (type.startsWith("Debit")) {
			System.out.println("Please enter your pin for the Debit Card: ");
			int tempPin = input.nextInt();
		}
		
		
		while(start == 1) {
			passOrFail = rand.nextInt(100000)+1;
			if (passOrFail < 50000) {
				System.out.println("The card was declined.");
				System.out.println("Would you like to try another card? (Y or N)");
				String answer = input.nextLine();
				if (answer.startsWith("Y")) {
					System.out.println("What is the name on the card?");
					name = input.nextLine();
					System.out.println("What is the 16 digit card number?");
					CCNum = input.nextLine();
					System.out.println("What is the security code on the back?");
					CVV = input.nextLine();
					System.out.println("What is the billing zipcode?");
					zip = input.nextLine();
					System.out.println("Is it debit or credit? (enter Debit or Credit)");
					type = input.nextLine();
					
					if (type.startsWith("Debit")) {
						System.out.println("Please enter your pin for the Debit Card: ");
						int tempPin = input.nextInt();
					}
					continue;
				}
				else {
					start = 0; 
					break;
				}
					
			}
			else {
				int confirmationNumber = passOrFail * (rand.nextInt(10)+1);
				System.out.printf("\nPayment is successful. Last 4 digits of the card: %s. Confirmation number: %d.\n",CCNum.substring(CCNum.length()-4, CCNum.length()),confirmationNumber);
				first.total=0;
				start = 0;
			}
		}
		
		
		
		
	}
}
