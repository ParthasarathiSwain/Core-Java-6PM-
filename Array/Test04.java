import java.util.Scanner;
class Test04{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size=sc.nextInt();

		int arr[]=new int[size];
		//array initialization
		for(int index=0;index<arr.length;index++){
			System.out.println("Enter arr["+index+"] value : ");
			arr[index]=sc.nextInt();
		}
		//printing the array
		for(int index=0;index<arr.length;index++){
			System.out.println("arr["+index+"] : "+arr[index]);
		}
		System.out.println("----------");

		int newArry[]=new int[size];

		for(int i=0;i<arr.length;i++){
			newArry[i]=arr[i]*arr[i];
		}
		System.out.println("----------");
		//printing new Array
		for(int i=0;i<newArry.length;i++){
			System.out.println("newArry["+i+"] : "+newArry[i]);
		}

	}
}

