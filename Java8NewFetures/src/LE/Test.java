package LE;

public class Test {
	public static void main(String[] args) {
		A a=()->{
			int x=10;
			int y=20;
			int z=x+y;
			System.out.println("Res : "+z);
		};
		a.add();
		
		B b1=(int y)->{
			System.out.println("B "+(y+30));
		};
		b1.add(30);
		
		B b2=(y)->{
			System.out.println("B "+(y+30));
		};
		b2.add(60);
		
		B b3=y->{
			System.out.println("B "+(y+30));
		};
		b3.add(70);
		
		C c=(d,k)->{
			return d+k;
		};
		int r=c.add(40, 70);
		System.out.println(r);
		
		D d=()->{
			for (int i = 1; i <= 10; i++) {
				System.out.println("i: "+i);
			}
		};
		d.print1to10();
	}
}















