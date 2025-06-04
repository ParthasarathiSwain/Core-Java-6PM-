class Parent{  //parent cls,super cls,base cls
	int x=90;
	public void m(){
		System.out.println("Parent Method");
	}
}

class Child extends Parent{   //Child cls,derived cls
	int x=77;
	public void m(){
		System.out.println("Child Method");
	}

	public static void main(String args[]){
		Child cld=new Child();
		System.out.println("Through child "+cld.x);
		cld.m();
		Parent par=new Parent();
	//	System.out.println("Through Parent "+par.y);
	}
}


