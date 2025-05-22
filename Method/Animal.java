class Animal{
	/*
	System.out.println("hy");
	if(2>9){ //illegal start of type
		System.out.println("9 is greater");
	}
	m();//invalid method declaration; return type required
	*/

	public static int add(int a,int b){
		int c=a+b;
	  return c;
	}
	public static void add2(int a,String b,boolean k){
		System.out.println(a);
		System.out.println(b);
		System.out.println(k);
	}

	static void run(){
		System.out.println("Animal is running");
	}

	public static void main(String args[]){
		Animal.run();
		Animal.add2(10,"Partha",true);
	}
}