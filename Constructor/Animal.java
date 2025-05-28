class Animal{
        String name;
        int age;
        double weight;
        double height;

        Animal(String name,int age,double weight,double height){
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.height=height;
        }
	public void printAnimal() {
  	  	System.out.println("Name : " + this.name + 
                       			"\nAge : " + this.age + 
                       			"\nWeight : " + this.weight + 
                       			"\nHeight : " + this.height);
	}


	public static void main(String args[]){
		Animal tiger=new Animal("BengalTiger",12,250.0,5.6);
		tiger.printAnimal();
		System.out.println("----------------------------------");
		Animal lion=new Animal("Affrican Lion",15,450.0,7.6);
		lion.printAnimal();

				
	}

}