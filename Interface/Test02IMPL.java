package Interface;

public class Test02IMPL implements Test02 {

	@Override
	public void m1(int x) {
		System.out.println("m1 method "+x);
		
	}

	@Override
	public void m2(String s) {
		System.out.println("m2 method "+s);
	}
	
	public static void main(String[] args) {
		Test02IMPL obj=new Test02IMPL();
		obj.m1(10);
		obj.m2("Hello");
		System.out.println("Test02IMPL PI "+Test02IMPL.PI);
		System.out.println("Test02 PI "+Test02.PI);
	}

}
