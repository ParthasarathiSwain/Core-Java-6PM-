class Student{
	static String clgName="BBSR ClG";
	String name;
	String roll;
	int age;
	String add;
	
	Student(String name,String r,int ag,String ad){
	   name=n;
	   roll=r;
	   age=ag;
	   add=ad;
	}

	public static void main(String args[]){
		Student s1=new Student("Subha Swain","100AD",20,"BBSR");

		System.out.println("Col Name : "+Student.clgName);
		System.out.println("Name : "+s1.name);
		System.out.println("Roll : "+s1.roll);
		System.out.println("Age  : "+s1.age);
		System.out.println("ADD  : "+s1.add);
		
		System.out.println("-------------------------");		

		Student s2=new Student("Partha Swain","101AD",27,"CTC");
		System.out.println("Col Name : "+Student.clgName);
		System.out.println("Name : "+s2.name);
		System.out.println("Roll : "+s2.roll);
		System.out.println("Age  : "+s2.age);
		System.out.println("ADD  : "+s2.add);
	}

}