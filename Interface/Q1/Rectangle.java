package Q1;
import java.util.Scanner;
public class Rectangle implements Shape{
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void getArea() {
		System.out.println("Enter Width : ");
		double width=sc.nextDouble();
		System.out.println("Enter Length : ");
		double length=sc.nextDouble();
		System.out.println("Area of Rectangele is : "+(width*length));
	}
	
}
