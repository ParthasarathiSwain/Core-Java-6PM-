import java.util.Scanner;
class Armstrong{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num!=0){
			int ld= num%10;
			int cube=ld*ld*ld;
			sum=sum+cube;
			num=num/10;
		}
		System.out.println(temp==sum?"Yes Num is Armstrong": "Num is Not Armstrong");
	}
}
/*
int num=153;
int temp=num;
int sum=0;   //27 
while(153!=0){ // true
	int ld= 153 % 10;  //  3
	int cube=3*3*3;    //  27
	sum=0+27;          //  27
	num=153/10;        //  15
}
---------------------------------
int num=15;
int temp=153;
int sum=0;  // 152
while(15!=0){ // true
	int ld= 15 % 10;     //  5
	int cube=5*5*5;      //  125
	sum=27+125;          //  152
	num=15/10;           //  1
}
-----------------------------------
int num=1;
int temp=153;
int sum=0;  // 153
while(1!=0){ // true
	int ld= 1 % 10;      //  1
	int cube=1*1*1;      //  1
	sum=152+1;           //  153
	num=1/10;           //  0
}

------------------------------------
int num=0;
int temp=153;
int sum=0;  // 153
while(0!=0){ // false
	          
}
  true          this block
153==153?"Yes Num is Armstrong": "Num is Not Armstrong"
*/