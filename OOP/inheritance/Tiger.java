//single level inheritance
class Animal{
	public final void bark(){
		System.out.println("Animal is barking");
	}
	public static void walk(){
		System.out.println("Animal is walking");
	}

	public void eat(){
		System.out.println("Animal is eating");
	}
	
	public void run(){
		System.out.println("Animal is running");
	}
	private void dance(){
		System.out.println("Animal is dancing");
	}
	protected void sleep(){
		System.out.println("Animal is sleeping");
	}
	void breeth(){
		System.out.println("Animal is breething");
	}
}
class Tiger extends Animal{
	/*
	@Override   // bark() in Tiger cannot override bark() in Animal
	public final void bark(){
		System.out.println("Tiger is barking");
	}
	*/
	//@Override static methods cannot be annotated with @Override
	public static void walk(){
		System.out.println("Tiger is walking");
	}

	@Override
	public void eat(){
		System.out.println("Tiger is eating");
	}
	@Override
	void breeth(){
		System.out.println("Tiger is breething");
	}

	private void dance(){
		System.out.println("Tiger is dancing");
	}

	public static void main(String args[]){
		Tiger t1=new Tiger();
	//	t1.run(); 
	//	t1.dance(); //we can't access parent class private member
	//	t1.sleep();
	//	t1.breeth();
		t1.dance();

		Animal a1=new Tiger();
		a1.run();
	//	a1.dance(); // dance() has private access in Animal
		a1.sleep();
		a1.breeth();
		a1.eat();
		a1.bark();
		Animal.walk(); Tiger.walk();
		
	}
}









