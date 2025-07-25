package withLE;

public class Test {
	public static void main(String[] args) {
		Animal animal=()->{ 
			System.out.println("Tiger is sleeping");
		};
		animal.sleep();
		
		Animal animal2=()->{
			System.out.println("Lion is sleeping");
		};
		animal2.sleep();
	}
}
