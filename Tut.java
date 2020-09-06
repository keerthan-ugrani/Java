package tutorial;

import java.util.Scanner;

public class Tut {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle:");
		float l = sc.nextFloat();
		System.out.println("Enter the breadth of the rectangle:");
		float b = sc.nextFloat();
		float area = l*b;
		System.out.println("Area of the rectangle is: "+area);
	}
}