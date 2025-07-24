package Interface;

public class Tiger {
	public static void main(String[] args) {
		Animal animal=()->{
			System.out.println("Tiger is running");
		};
		animal.run();
	}
}
