class Test13{
	public static void main(String args[]){
		int x[]={10,20,30,40,50,60};

		for(int i=0;i<x.length;i++){
       			System.out.print(x[i]+" ");
		}

		System.out.println();

		
		for(int i=0;i<x.length/2;i++){
       			int temp=x[i];
			x[i]=x[x.length-1-i];
			x[x.length-1-i]=temp;
		}

		for(int i=0;i<x.length;i++){
       			System.out.print(x[i]+" ");
		}


		

	}
}