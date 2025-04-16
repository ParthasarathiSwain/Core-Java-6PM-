import java.util.Scanner;
class Test05{
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
		
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}else{
                                min=arr[i];
                        }
		}
		System.out.println("Maximum Element is : "+max);
		System.out.println("Minimum Element is : "+min);


		
	}
}

