class Test15{
	public static void main(String args[]){
		int x[][]=new int[2][2];
		x[0][0]=20;
		x[0][1]=30;
		x[1][0]=70;
		x[1][1]=80;

		for(int row=0; row<2; row++){  
       			for(int col=0; col<2; col++){ 
                 		System.out.println("x["+row+"] ["+col+"] : "+x[row][col]);   
        		}
		}

	}
}