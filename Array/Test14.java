class Test14{
	public static void main(String args[]){
		int x[]={10,2,30,40,50,60};

		boolean b=true;

		for(int i=1;i<x.length;i++){
       			if(x[i]<x[i-1]){
				b=false;
			}
		}

		if(b==true){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

		

	}
}