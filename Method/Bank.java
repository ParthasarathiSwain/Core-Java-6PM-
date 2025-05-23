class Bank{
	String accHolderName;
	long accNum;
	double balance;
	

	public static void getBankDetails(){
		System.out.println("Bank Name : SBI");
		System.out.println("Bank IFSC : SBI0081");
		System.out.println("Bank Add  : BBSR");
	}
	public void deposite(double bal){
		if(bal<=0){
			System.out.println("Please Enter Amount!");
		}else{
			balance=balance+bal;
			System.out.println(bal+" successfully Deposited!");
		}
	}
	public void widraw(double bal){
		if(bal<=balance){
		     balance=balance-bal;
		     System.out.println(bal+" successfully Withdrawal!");
		}else{
			System.out.println("insuficient balance !Please try Again!");
		}
	}
	public void getAccDetails(){
		System.out.println("Acc Name : "+accHolderName);
		System.out.println("Acc Num  : "+accNum);
		System.out.println("Acc bal  : "+balance);
	}

	public static void main(String args[]){
		Bank.getBankDetails();

		Bank person1=new Bank();
		person1.accHolderName="Subhalaxmi Seth";
		person1.accNum=11988776655l;
		person1.deposite(5000.0);

		person1.getAccDetails();

		person1.deposite(2000.0);

		person1.getAccDetails();
		
		System.out.println("-----------------------------------------");
		Bank.getBankDetails();
		Bank person2=new Bank();
		person2.accHolderName="Subhlipsha Swain";
		person2.accNum=112222225l;
		person2.getAccDetails();
		person2.deposite(1000.0);
		person2.getAccDetails();
		//person2.deposite(-10000.0);
		person2.widraw(500);
		person2.getAccDetails();
	}
}