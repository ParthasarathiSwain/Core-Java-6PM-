package IssuesWithFI;

public class Test {
	public static void main(String[] args) {
		A a=(x,y)->{
			int z=x+y;
			System.out.println("A Res : "+z);
		};
		a.add(10, 20);
		
		B b=(s,f)->{
			float z=s+f;
			System.out.println("B Res : "+z);
		};
		b.add(20.9f, 30.1f);
		
		C c=(w,q)->{
			double d=w+q;
			System.out.println("C Res : "+d);
		};
		c.add(12.34, 44.55);
	}
}
