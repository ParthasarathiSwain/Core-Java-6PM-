package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		
		try {
			
			System.out.println("Enter a Value :");
			 a=sc.nextInt();
			System.out.println("Enter b Value :");
			 b=sc.nextInt();
			 System.out.println("Div : "+(a/b));
			 
		}
		catch (InputMismatchException e) {
			//e.printStackTrace();
			System.out.println("Please enter integer value !");
		}
		catch (ArithmeticException ae) {
			System.out.println("Don't Sec Value as Zero!");
		}
		finally {
			sc.close();
		}
		
		
		
	}
}
