import java.util.Scanner;

public class BankAccount  implements BankOperation{
	private String accNumber;
	private String holderName;
	private String pin;
	private double balance;
	private boolean active;
	private String transcationHistory[]=new String[10];
	Scanner sc=new Scanner(System.in);
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
		}
	}
	
}
