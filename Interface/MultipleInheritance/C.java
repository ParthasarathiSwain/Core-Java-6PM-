package MultipleInheritance;

public class C extends D implements A,B{
	@Override
	public void sleep() {
		System.out.println("Child sleep ");
	}
	@Override
	public void run() {
		System.out.println("Child run ");
	}
	@Override
	public void eat() {
		System.out.println("Child eat ");
	}
	public static void main(String[] args) {
		
		System.out.println(C.x);
		System.out.println(C.y);
		
		C obj=new C();
		obj.sleep();
	}
	

	
}
