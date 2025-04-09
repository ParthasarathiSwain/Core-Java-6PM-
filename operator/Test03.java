class Test03{
	public static void main(String args[]){
		int x=8;
		int y=2;
		int z=x/y;  //4
		System.out.println("Z : "+z);

		int p=1000;
		int q=0;
	//	int s=p/q;  //  java.lang.ArithmeticException: / by zero
	//	System.out.println("S : "+s);

		float f=-1000.00f;
		float e=0.0f;
		float h=f/e;  
		System.out.println("h : "+h); //  -Infinity

		float r=0.0f;
		int t=0;
		float g=r/t;
		System.out.println("g : "+g); //NaN = Not a Number

		 
		
	}
}