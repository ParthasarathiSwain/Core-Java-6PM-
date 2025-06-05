//multi level 
class A{
	int x=90;
}


class B extends A{
	int y=80;
}

class C extends B{
	int z=70;
	public static void main(String args[]){
		C obj=new C();
		System.out.println("X :"+obj.x);
		System.out.println("Y :"+obj.y);	
		System.out.println("Z :"+obj.z);

		A a1=new C();
	//	C c1= new A();	//incompatible types: A cannot be converted to C		
	}

}