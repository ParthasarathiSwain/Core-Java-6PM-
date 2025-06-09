abstract class Animal{
	public abstract void eat(int x);
	protected abstract void run();
	abstract void walk();

}
class Test02 extends Animal{
	@Override
	public  void eat(int x){
		System.out.println("child class eat method");
	}
	@Override
	protected  void run(){
		System.out.println("child class run method");
	}
	@Override
	void walk(){
		System.out.println("child class walk method");
	}
	public static void main(String args[]){
		Test02 tiger=new Test02();
		tiger.walk();
	}
}







/*	
	public static abstract  void bark();
	private abstract void ss();
	final abstract void ff();
	
	<AM> <EM> <RT> <MN>(<PM>){
		//normal method declaration
	}
*/
