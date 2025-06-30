package ExceptionHandling;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter size  :");
		try {
			int size=sc.nextInt();
			int x[]=new int[size];
			
			for (int i = 0; i < x.length; i++) {
				System.out.println("Enter value of index  "+i);
				x[i]=sc.nextInt();
			}
		}catch (NegativeArraySizeException e) {
			System.out.println("Please enter +ve number");
		}catch(ArrayIndexOutOfBoundsException aa) {
			System.out.println("");
		}
		
	}
}
