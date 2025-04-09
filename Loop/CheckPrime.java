import java.util.Scanner;
class CheckPrime{
      public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number : ");
	int n=sc.nextInt();

	int i=2;
	int count=0;

	while(i*i<=n){
	   if(n%i==0){
		count++;
	   }
	   i++;
	}
	if(count==0){
		System.out.println("Number is Prime !");
	}else{
		System.out.println("Number is Not Prime !");
	}
      }
}