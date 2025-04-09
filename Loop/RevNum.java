import java.util.Scanner;
class RevNum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int rev=0;
		for(  ;n!=0; ){
		   int lastDigit= n%10;
		   rev=rev*10+lastDigit;
		   n=n/10;
		}
		System.out.println("Reverse is : "+rev);
	}
}