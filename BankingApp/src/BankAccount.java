

public class BankAccount  implements BankOperation{
	private String accNumber;
	private String holderName;
	private String pin;
	private double balance;
	private boolean active;
	private String transcationHistory[]=new String[10];
	java.util.Scanner sc=new java.util.Scanner(System.in);
	int taxCount=0;
	
	@Override
	public void createAccount() {
		System.out.println("Enter Account Number :");
		accNumber=sc.nextLine();
		
		System.out.println("Enter Account Holder Name :");
		holderName=sc.nextLine();
		
		System.out.println("Set 4-digit Pin :");
		pin=sc.nextLine();
		
		System.out.println("Enter Initial Deposite :");
		balance=sc.nextDouble();
		
		taxHistory("Account Initial Deposite is "+balance);
		active=true;
		
		System.out.println("Account Created Successfully !");
	}
	//tax History
	public void taxHistory(String message) {
		if (taxCount<transcationHistory.length) {
			transcationHistory[taxCount]=message;
			taxCount++;
		}
	}
	@Override
	public boolean checkUserExist(String accNum, String pin) {
		if (this.active && this.accNumber.equals(accNum) && this.pin.equals(pin)) {
			return true;
		}
		return false;
	}
	@Override
	public void deposite(double amount) {
		if (active && amount>0) {
			this.balance=this.balance+amount;
			taxHistory("Amount Deposited "+amount);
			System.out.println("💰"+amount +" Deposited Succesfully!");
		} else {
			System.out.println("⚠️ Invalid Deposite Amount !");
		}
		
	}
	@Override
	public void withdraw(double amount) {
		if (active  && amount>0 && amount<=balance) {
			this.balance=this.balance-amount;
			taxHistory("Amount Withdrwan "+amount);
			System.out.println("💸"+amount +" Withdrawn Succesfully!");
		} else {
			System.out.println("⚠️ Insufficient balance or Invalid request !");
		}
		
	}
	@Override
	public void diplayDetails() {
		if (active) {
			System.out.println("=======Account Details=======");
			System.out.println("Account No : "+this.accNumber);
			System.out.println("Name       : "+this.holderName);
			System.out.println("Balance    : "+this.balance);
		}
	}
	@Override
	public void miniStatement() {
		if (active) {
			System.out.println("🧾 Mini Statement : ");
			for (int i = 0; i < taxCount; i++) {
				System.out.println((1+i)+" : "+transcationHistory[i]);
			}
		}
		
	}
	@Override
	public void deleteAccount() {
		accNumber=null;
		holderName=null;
		pin=null;
		balance=0;
		active=false;
		transcationHistory=new String[10];
		System.out.println("Account Deleted Successfully");
	}
	@Override
	public String toString() {
		return "[accNumber=" + accNumber + ", holderName=" + holderName + ", balance=" + balance
				+ ", active=" + active + ", sc=" + sc + "]";
	}
	
	
}
