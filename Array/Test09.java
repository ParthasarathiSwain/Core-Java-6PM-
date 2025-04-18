class Test09{
	public static void main(String args[]){
		int x[]={12,34,22,4,56,78};
		boolean b=false;
		int search=9;
		for(int i=0;i<x.length;i++){
       			if(x[i]==search){
         		  b=true;
        		  break;
     			 }
		}
		if(b==true){
   		     System.out.println("Element is Present");
		}else{
		     System.out.println("Element is Not Present");
		}


	}
}