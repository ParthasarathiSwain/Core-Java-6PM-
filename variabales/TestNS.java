class TestNS{
	int x=90;
	int y;

	{
	   System.out.println("NS-Block");
	   y=80;
	}
	int z;
	TestNS(){
	  System.out.println("NS-Cons");
	  z=66;
	}

	public static void main(String args[]){
		System.out.println("Hyy");
		TestNS obj1=new TestNS();
		System.out.println("X : "+obj1.x);
		System.out.println("Y : "+obj1.y);
		System.out.println("Z : "+obj1.z);
		System.out.println("K : "+obj1.k);
		System.out.println("-------------------");
		TestNS obj2=new TestNS();
		System.out.println("X : "+obj2.x);
		System.out.println("Y : "+obj2.y);
		System.out.println("Z : "+obj2.z);
		System.out.println("K : "+obj2.k);
		System.out.println("-------------------");
		TestNS obj3=new TestNS();
		obj3.z=11111;
		System.out.println("X : "+obj3.x);
		System.out.println("Y : "+obj3.y);
		System.out.println("Z : "+obj3.z);
		System.out.println("K : "+obj3.k);
		System.out.println("-------------------");
		TestNS obj4=new TestNS();
		System.out.println("X : "+obj4.x);
		System.out.println("Y : "+obj4.y);
		System.out.println("Z : "+obj4.z);
		System.out.println("K : "+obj4.k);
		System.out.println("-------------------");
		TestNS obj5=new TestNS();
		System.out.println("X : "+obj5.x);
		System.out.println("Y : "+obj5.y);
		System.out.println("Z : "+obj5.z);
		System.out.println("K : "+obj5.k);

	}

	int k;
	{
	   System.out.println("NS-Block   K");
	   k=77;
	}
	
}