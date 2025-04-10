import java.util.Scanner;
class PerfectNum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++){
			if(num%i==0){
				sum=sum+i;	
			}
		}
		System.out.println(num==sum?"Number Is Perfect":"Number Is Not Perfect");
	}
}