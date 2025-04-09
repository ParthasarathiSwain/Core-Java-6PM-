import java.util.Scanner;
class CheckUpperLower{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Alphabet :");
		char c=sc.next().charAt(0);
		int x=c;
		if(x>=65 && x<=90){
			System.out.println("Charecter is Uppercase!");
		}else if(x>=97 && x<=122){
			System.out.println("Charecter is Lowercase!");
		}else{
			System.out.println("Not a Alphabet!");
		}
	}
}