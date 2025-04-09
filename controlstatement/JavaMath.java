import java.util.Scanner;
class JavaMath{
	public static void main(String args[]){
	/*
		Scanner sc=new Scanner(System.in);            
		System.out.println("Enter first num :");
		int first=sc.nextInt();
		System.out.println("Enter Sec num :");
		int sec=sc.nextInt();

		int max=Math.max(first,sec);
		System.out.println("Max Number is : "+max);

		int min=Math.min(first,sec);
		System.out.println("Min Number is : "+min);

		double d=Math.sqrt(16);
		System.out.println("Square root : "+d);
       */
		int randomNum = (int)(Math.random() * 1000001);
		System.out.println("Random 6 digit : "+randomNum);
	}
}