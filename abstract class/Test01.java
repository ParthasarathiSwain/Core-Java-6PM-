abstract class Test01{
	final int x=80;  //allowed
	static int y=70; //allowed
	int z=80;	 //allowed
	static{}	 //allowed
	{}		 //allowed
	Test01(){	 //allowed

	}
	static void m1(){}//allowed
	void m2(){
		
	}	 //allowed
	public static void main(){
	//	Test01 obj=new Test01();Test01 is abstract; cannot be instantiated
	}
	
	abstract void sleep();
}

/*
 class A{
    class level variable final, static and non-static 
	final int z=88;
	static int x=90;
	int y=80;
    static and non-static block
	static{}
	{}
	constructors
	A(){

	}
	methods
	static void m1(){
	
	}
	void m2(){}
	final static void m3(){
	
	}

	main methods
}

	new A();
*/

