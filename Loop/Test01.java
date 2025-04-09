import java.util.Scanner;
class Test01{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();
		int i=1;
		do{
			System.out.println("I value : "+i);
			i++;
		}while(i<=n);
	}
}