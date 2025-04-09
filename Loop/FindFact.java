import java.util.Scanner;
class FindFact{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();

		long fact =1;
		for(int i=1;i<=n;i++){
			//fact = fact*i;
			  fact*=i;
		}
		System.out.println(n+" Factorial is : "+fact);
	}
}