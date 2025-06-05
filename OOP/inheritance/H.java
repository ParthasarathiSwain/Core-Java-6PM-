//java does not supports multiple inheritance due to this abmbiguity 
class P1{
	void sleep(){
		System.out.println("HY");
	}
}
class P2{
	void sleep(){
		System.out.println("Bye");
	}

}
class H extends P1,P2{
	public static void main(String args[]){
		H obj=new H();
		obj.sleep();
	}
}