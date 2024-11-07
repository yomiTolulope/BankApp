import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionMenu extends Account {
	
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	/* Validate Login information customer number and pin number */
	
	public void getLogin() throws IOException {
		int x = 1;
		
		do {
			try {
				
				data.put(952141, 9876);
				data.put(989947, 1890);
				
				System.out.println("Welcome to ATM Project!");
				
				System.out.println("Enter your customer Number: ");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("Enter your PIN Number: ");
				setPinNumber(menuInput.nextInt());
			} catch (Exception e) {
				System.out.println("\n" + " Invalid Character(s). Only Numbers." + "\n");
				x = 2;
			}
			
			  for(Entry<Integer, Integer> entry : data.entrySet()){
			  if (entry.getKey()== getCustomerNumber() && entry.getValue()== getPinNumber()){
			  getAccountType();
			  
			  } 
		}
			 
//			int cn = getCustomerNumber();
//			int pn = getPinNumber();
//			if (data.containsKey(cn) && data.get(cn) == pn) {
//				getAccountType();
//			} else
		
				System.out.println("\n" + " Wrong Customer Number " + "\n");
		} while (x == 1);
	}
	
	/* Display Account Type Menu with selection */
	
	public void getAccountType() {
		System.out.println("Select the Account you want to Access: ");
		System.out.println("Type 1 - Checking Account");
		System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exist");
		System.out.print("Choice: ");
		
		int selection = menuInput.nextInt();
		
		switch (selection) {
		case 1:
			getChecking();
			break;
			
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("Thank You for using this service, bye. \n");
			break;
			
			default:
				System.out.println("\n" + "Invalid Choice." + "\n");
				getAccountType();
		}
	}
	
	/* Display Checking Account Menu with selections */
	
	public void getChecking() {
		System.out.println("Checking Account: ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		System.out.println("Choice: ");
		
		int selection = menuInput.nextInt();
		
		switch (selection) {
		case 1:
			System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
			
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank You for using this service, bye.");
			break;
			
			default:
				System.out.println("\n" + "Invalid Choice." + "\n");
				getChecking();
	}
}

	/* Display Saving Account Menu with selection */
	
	public void getSaving() {
		System.out.println("Saving Account: ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		System.out.println("Choice: ");
		
		int selection = menuInput.nextInt();
		
		switch (selection ) {
		case 1:
			System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
			
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank You for using this ATM. bye.");
			break;
			
			default:
				System.out.println("\n" + "Invalid Choice." +  "\n");
				getSaving();
		}
	}
}