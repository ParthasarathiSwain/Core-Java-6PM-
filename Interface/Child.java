package Interface;

public class Child implements Test01{

	@Override
	public void m1() {
		System.out.println("Child class m1() ");
		
	}
	public static void main(String[] args) {
		Child c1=new Child();
		c1.m1();
	//	Test01 obj=new Test01();
		Test01 obj=new Child();
		obj.m1();
	}
}
