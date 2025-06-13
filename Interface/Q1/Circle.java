package Q1;
import java.util.Scanner;
public class Circle implements Shape{
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void getArea() {
		double PI=3.141;
		System.out.println("Enter Radius : ");
		double r=sc.nextDouble();
		System.out.println("Area of circle is : "+(PI*r*r));
	}

}
