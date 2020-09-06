package tutorial;

import java.util.Scanner;

public class ParallelogramArea{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of base:");
		float base = sc.nextFloat();
		System.out.println("Enter the value of height:");
		float height = sc.nextFloat();
		double area = base*height;
		System.out.println("The area of the pentagon is: "+area);
	}
}