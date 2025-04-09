import java.util.Scanner;
class MaxNum{
	public static void main(String args[]){
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a=sc.nextInt();
		System.out.println("Enter value of b : ");
		int b=sc.nextInt();
		if(a>b){
			System.out.println("a is Max Num");
		}else{
			System.out.println("b is Max Num");
		}
	}
}