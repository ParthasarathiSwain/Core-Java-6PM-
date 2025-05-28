
class Employee {
	String empName;
	int empId;
	String empEmail;
	String empPass;
	String empAdd;

	Employee(){
                this("hhh",99,"uuuu","jjj","kk");
		System.out.println("No param Cons");
	}
	Employee(String empName,int empId,String empEmail){
		this("hhh",99,"uuuu","jjj","kk");
		System.out.println("3-param Cons");
	}

	Employee(String empName,int empId,String empEmail,String empPass,String empAdd){

		System.out.println("5-param Cons");
	}
	
	public static void main(String args[]){
		Employee obj=new Employee();
		
	}
}