package tutorial;

import java.util.Scanner;

public class AreaSphere{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of a sphere:");
		float rad = sc.nextFloat();
		double Vol = 4.0*3.14*rad*rad;
		System.out.println("Volume of a sphere is:"+Vol);
		
	}
}