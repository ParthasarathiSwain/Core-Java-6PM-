import java.util.Scanner;

public class BankingApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank bank=new Bank();
		
		int choice;
		while(true) {
			System.out.println("========Bank Manu=======");
			System.out.println("1- Create Account");
			System.out.println("2- Login Account");
			System.out.println("3- Show All Account");
			System.out.println("4- Exit");
			System.out.println("Enter a choice : ");
			choice=sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: {
				bank.OpenBankAccount();
				break;
			}
			case 2: {
				System.out.println("Enter Account Number :");
				String accNo=sc.nextLine();
				
				System.out.println("Enter 4-Digit Pin :");
				String pin=sc.nextLine();
				BankAccount  userAcc=bank.login(accNo, pin);
				if (userAcc!=null) {
					System.out.println("Login Successfully !");
				} else {
					System.out.println("Login Failed!");
				}
				int opt;
				while(true) {
					System.out.println("1- Deposite");
					System.out.println("2- Withdraw");
					System.out.println("3- ShowDetails");
					System.out.println("4- Mini Statement");
					System.out.println("5- Delete Account");
					System.out.println("6- Logout");
					System.out.println("Enter one Option :");
					opt=sc.nextInt();
					sc.nextLine();
					
					switch (opt) {
					case 1:{
						System.out.println("Deposite");
						break;
					}
					case 2:{
						System.out.println("withdrawl");
						break;
					}	
					case 3:{
						System.out.println("details");
						break;
					}	
					case 4:{
						System.out.println("mini-s");
						break;
					}
					case 5:{
						System.out.println("Delete Acc");
						break;
					}
					case 6:{
						System.out.println("logout");
						break;
					}
					default:
						System.out.println("Invalid Option !");
					}
					
				}
			}
			case 3: {
				System.out.println("show all account");
				break;
				
			}
			case 4: {
				System.out.println("Thank You For Using Bankin Application!");
				break;
			}
			default:
				System.out.println("Invalid Choice !");
			}
		}
	}
}
