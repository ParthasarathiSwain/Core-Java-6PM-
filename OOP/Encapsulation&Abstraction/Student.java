class  Student{
	private String name;
	private String roll;
	private int age;
	private String add;

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}

	public void setRoll(String roll){
		this.roll=roll;
	}
	public String getRoll(){
		return this.roll;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return this.age;
	}

	public void setAdd(String add){
		this.add=add;
	}
	public String getAdd(){
		return this.add;
	}

	public void printStudent(){
		System.out.println("[ Name : "+this.name+
				     ", Roll : "+this.roll+
				     ", Age : "+this.age+
				     ", Add : "+this.add+" ]");
	}
	
}