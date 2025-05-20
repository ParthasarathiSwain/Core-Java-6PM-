class TestStatic04{
        static int x;  //x=0
	static int y;  //y=0
	static{
	   System.out.println("x : "+TestStatic04.x);  //x :0
	   System.out.println("y : "+TestStatic04.y);  //y :0
	   y=90;   //y=90
	   System.out.println("Static Block Executed,x&y got memory");	
	}

  	static int k=getValue();   
        static int getValue(){
		System.out.println("k : "+TestStatic04.k); // k:0
		System.out.println("getValue Method Executed");
		return 49;
	}

	public static void main(String args[]){
		System.out.println("Main method start");

		System.out.println("x : "+TestStatic04.x); //0
		System.out.println("y : "+TestStatic04.y); //90
		System.out.println("s : "+TestStatic04.s); //70
		System.out.println("k : "+TestStatic04.k); //49

		System.out.println("Main method end");

	}
        static int s;   //s=0
        static{
	   s=70;   //s :70
	   System.out.println("Static Block Executed, s got memory");
	}

	
}