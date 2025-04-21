class Test12{
	public static void main(String args[]){
		int x[]={12,34,22,4,56,78};

		for(int i=0;i<x.length;i++){
       			System.out.print(x[i]+" ");
		}

		System.out.println();

		int temp[]=new int[x.length];
		int c=0;
		for(int i=x.length-1;i>=0;i--){
       			temp[c]=x[i];
			c++;
		}

		for(int i=0;i<temp.length;i++){
       			System.out.print(temp[i]+" ");
		}


		

	}
}