import java.util.Scanner;
import java.lang.*;
class Test05{
	
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a ");
		int a=sc.nextInt();
		System.out.println("Enter value of b ");
		int b=sc.nextInt();

		if(b<=0){
			throw new ArithmeticException();
		}else{
			System.out.println(a/b);
		}
		
	}
}