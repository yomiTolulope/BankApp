import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	/* Set the customer number */
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
	/* Get the customer number */

	public int getCustomerNumber() {
		return customerNumber;
	}
	
	/* Set the pin number */

	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	/* Get the pin number */

	public int getPinNumber() {
		return pinNumber;
	}
	
	/* Get Checking Account Balance */

	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	/* Get Saving Account Balance */
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	/* Calculate Checking Account withdrawal */
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
	/* Calculate Saving Account withdrawal */
	
	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	/* Calculate Checking Account deposit */
	
	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}
	
	/* Calculate Saving Account deposit */

	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	
	/* Customer Checking Account withdraw input */

	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.print("Amount you want to withdraw form checking Account: ");
		double amount = input.nextDouble();
		
		if ((checkingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
		} else {
			System.out.println("Balance Cannot be Nagative." + "\n");
		}
	}
	
	/* Customer Saving Account withdraw input */
	
		public void getSavingWithdrawInput() {
			System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
			System.out.print("Amount you want to withdraw form saving Account: ");
			double amount = input.nextDouble();
			
			if ((savingBalance - amount) >= 0) {
				calcSavingWithdraw(amount);
				System.out.println("New saving Account Balance: " + moneyFormat.format(savingBalance));
			} else {
				System.out.println("Balance Cannot be Nagative." + "\n");
			}
	}
		
		/* Customer Checking Account Deposit  input*/
		
		public void getCheckingDepositInput() {
			System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
			System.out.print("Amount you want to Deposit form checking Account: ");
			double amount = input.nextDouble();
			
			if ((checkingBalance + amount) >= 0) {
				calcCheckingDeposit(amount);
				System.out.println("New saving Account Balance: " + moneyFormat.format(checkingBalance));
			} else {
				System.out.println("Balance Cannot be Nagative." + "\n");
			}
		}
		
		/* Customer Saving Account Deposit input */
		
		public void getSavingDepositInput() {
			System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
			System.out.println("Amount you want to Deposit form Saving Account: ");
			double amount = input.nextDouble();
			
			if ((savingBalance + amount) >= 0) {
				calcSavingDeposit(amount);
				System.out.println("New saving Account Balance: " + moneyFormat.format(savingBalance));
			} else {
				System.out.println("Balance Cannot be Nagative." + "\n");
			}
		}
		
		
}


