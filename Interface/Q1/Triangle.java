package Q1;
import java.util.Scanner;
public class Triangle implements Shape{
	Scanner sc=new Scanner(System.in);
	@Override
	public void getArea() {
		System.out.println("Enter Base : ");
		double base=sc.nextDouble();
		System.out.println("Enter Height : ");
		double height=sc.nextDouble();
		System.out.println("Area of Tringle is : "+((base*height)/2));
	}

}
