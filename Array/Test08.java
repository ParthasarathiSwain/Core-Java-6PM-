class Test08{
	public static void main(String args[]){
		int x[]={7,15,81,92,8,3,92,5,7};
		for(int i=0;i<x.length;i++){
			for(int j=i+1;j<x.length;j++){
				if(x[i]==x[j]){
					System.out.println(x[i]);
					break;
				}
			}
		}
	}
}