package tutorial;
import java.util.Scanner;

public class AreaPent{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		float a = sc.nextFloat();
		System.out.println("Enter the value of s:");
		float s = sc.nextFloat();
		double area = (5.0/2.0)*s*a;
		System.out.print("Area of a pentagon is: "+ area);
	}
}