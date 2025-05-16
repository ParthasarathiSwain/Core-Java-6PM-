class TestStatic02{
        private static int x;
	public static int y=90;//direct initialization
	protected static int z;
	static{   // initialize through static block	    
	    z=80; //static block	    
	}

	static int f=z;
	static int u=z+f;

	static int h=TestStatic02.m1();
	
	static int m1(){
	   return 69;
	}
	public static void main(String args[]){
		System.out.println("x : "+TestStatic02.x); //0
		System.out.println("y : "+TestStatic02.y); //90
		System.out.println("z : "+TestStatic02.z); //80
		System.out.println("f : "+TestStatic02.f); //80
		System.out.println("u : "+TestStatic02.u); //160
		System.out.println("h : "+TestStatic02.h); //69
	}

}