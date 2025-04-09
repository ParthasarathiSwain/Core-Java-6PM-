import java.util.Scanner;
class RevPrint{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();

		for(int i=n;i>0;i--){
			System.out.println(i);
		}
		
	}
}