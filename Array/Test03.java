
class Test03{
	public static void main(String args[]){
		java.util.Scanner  sc = new java.util.Scanner(System.in);
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

		int res=0;
		for(int i=0;i<arr.length;i++){
			res=res+arr[i];
		}
		System.out.println("Sum of element is : "+res);

	}
}

