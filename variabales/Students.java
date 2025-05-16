class Students{
	static String schoolName="Bhubaneswar School"; //static variable
	String name;	//Non-static
	String rollNum; //Non-static
	int age;	//Non-static
	String address; //Non-static

	void getStudentData(String rollNum){ //Parameter variable
		int x=90; //local variable
	}

	public static void main(String args[]){//Parameter variable
		System.out.println(TestStatic.x);
	}
}