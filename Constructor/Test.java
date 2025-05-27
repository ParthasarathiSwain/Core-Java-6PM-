class Test{	
	//no param cons
	Test(){
		System.out.println("No Param Cons Called");
	}
	Test(int x){
		System.out.println("1-Param Cons Called");
	}
	Test(int x,int y){
		System.out.println("2-Param Cons Called");
	}

	public static void main(String args[]){
		Test obj1=new Test();
		Test obj2=new Test(30);
		Test obj3=new Test(10,29);
	}
}