class Tiger{
	String breedName;
	String name;
	int age;
	double weight;
	
	public static void main(String args[]){
		Tiger t1=new Tiger();  //Empty Object
	/*
		System.out.println(t1.breedName);
		System.out.println(t1.name);
		System.out.println(t1.age);
		System.out.println(t1.weight);
	*/
		t1.breedName="Bengal Tiger";
		t1.name="Hari";
		t1.age=12;
		t1.weight=230.0;

		System.out.println("breedName : "+t1.breedName);
		System.out.println("Name : "+t1.name);
		System.out.println("age : "+t1.age);
		System.out.println("weight : "+t1.weight);
		
		System.out.println("-------------------------");


		Tiger t2=new Tiger();  
		t2.breedName="Nepal Tiger";
		t2.name="Raja";
		t2.age=13;
		t2.weight=260.0;

		System.out.println("breedName : "+t2.breedName);
		System.out.println("Name : "+t2.name);
		System.out.println("age : "+t2.age);
		System.out.println("weight : "+t2.weight);

		System.out.println("-------------------------");


		Tiger t3=new Tiger();  
		t3.breedName="Indonesia Tiger";
		t3.name="Pardeep";
		t3.age=15;
		t3.weight=560.0;

		System.out.println("breedName : "+t3.breedName);
		System.out.println("Name : "+t3.name);
		System.out.println("age : "+t3.age);
		System.out.println("weight : "+t3.weight);

	}
    
}