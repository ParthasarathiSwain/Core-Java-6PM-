class Vehicle{
	static int y=80;
        static int x;
	static{
		x=90;
		System.out.println("Vehicle class Static block");
	}

	int k;
	{
		k=90;
		System.out.println("Vehicle class Non-Static block");
	}
	Vehicle(){
		System.out.println("Vehicle class Cons");
	}
}
class Car extends Vehicle{
	static int z;
	static{
		z=88;
		System.out.println("Car class Static block");
	}
	int u;
	{
		u=33;
		System.out.println("Car class Non-Static block");
	}
	Car(){
		super();
		System.out.println("Car class Cons");
		System.out.println(super.k);
	}
	public static void main(String args[]){
		
		System.out.println("Main Method start");
	//	Vehicle v=new Vehicle();
		Car c=new Car();
		System.out.println();
		
		System.out.println("Main Method end");
	}
}


