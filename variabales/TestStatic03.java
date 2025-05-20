class TestStatic03{

        int f;
        {
	  f=100;
	  System.out.println("Non-Static Block Executed");	
        }
       
	static int x=90;

	static int y;  //y=0

	static{
	   y=80;   //y=80
	   System.out.println("Static Block Executed, y got memory");	
	}
  


	public static void main(String args[]){
		System.out.println("Main method start");

		System.out.println("x : "+TestStatic03.x);
		System.out.println("y : "+TestStatic03.y);
		System.out.println("s : "+TestStatic03.s);

		TestStatic03  obj1=new TestStatic03();
		
		TestStatic03  obj2=new TestStatic03();

		System.out.println("Main method end");

	}
	

        static int s;
        static{
	   s=70;
	   System.out.println("Static Block Executed, s got memory");
	}

	
}