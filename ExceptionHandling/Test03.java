package ExceptionHandling;

public class Test03 {
	public static void main(String[] args) {
		try {
			int x=Integer.parseInt(args[0]);
			System.out.println("x : "+x);
		}catch(ArrayIndexOutOfBoundsException aeibo) {
			System.out.println("Please pass a value!");
		}
	}
}
