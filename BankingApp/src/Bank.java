
public class Bank {
	 private BankAccount[] accounts=new BankAccount[100];
	 private int count=0;
	 
	 public void OpenBankAccount() {
		 if (count<accounts.length) {
			BankAccount newAcc= new BankAccount();
			newAcc.createAccount();
			accounts[count]=newAcc;
			count++;
		}else {
			System.out.println("Can't Create Account !");
		}
	 }
	 public BankAccount login(String accNum,String pin) {
		 for (int i = 0; i < accounts.length; i++) {
			if (accounts[i]!=null && accounts[i].checkUserExist(accNum, pin)) {
				return accounts[i];
			}
		}
		 return null;
	 }
}
