package tutorial;

import java.util.Scanner;

public class VolSphere{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pie = 3.14;
		System.out.println("Enter the radius of the sphere");
		double rad = sc.nextDouble();
		double vol = (4.0/3.0)*pie*(rad*rad*rad);
		System.out.println("volume of sphere is: "+vol);
	}
}