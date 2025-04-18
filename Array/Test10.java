class Test10{
	public static void main(String args[]){
		int size=8;
		int  x[]=new int[size];
		x[0]= 11;
		x[1]= 22;
		x[2]= 33;
		x[3]= 44;
		x[4]= 55;
		x[5]= 66;
                x[6]= 88;
		for(int i=0;i<x.length;i++){
			System.out.println("x["+i+"] : "+x[i]);
		}

		int pos=7;
		int newElement=90;

		for(int i=x.length-1 ;i>pos;i--){
    		       x[i]=x[i-1];
     		}
		x[pos]=newElement;
	       
		System.out.println("------------------");
		for(int i=0;i<x.length;i++){
			System.out.println("x["+i+"] : "+x[i]);
		}

		

	}
}