
public interface BankOperation {
	void createAccount();
	boolean checkUserExist(String accNum,String pin);
	void deposite(double amount);
	void withdraw(double amount);
	void diplayDetails();
	void miniStatement();
}
