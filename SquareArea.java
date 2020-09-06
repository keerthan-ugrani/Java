package tutorial;

import java.util.Scanner;

public class SquareArea{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of the side of a square:");
		float a = sc.nextFloat();
		System.out.println("Area of a square is:"+a*a);
	}
}