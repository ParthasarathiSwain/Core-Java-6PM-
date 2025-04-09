import java.util.Scanner;
class CheckPalindrome{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		for(  ;n!=0; ){
		   int lastDigit= n%10;
		   rev=rev*10+lastDigit;
		   n=n/10;
		}
		if(temp==rev){
			System.out.println("Number is Palindrome! ");
		}else{
			System.out.println("Number is Not Palindrome! ");
		}

		
	}
}