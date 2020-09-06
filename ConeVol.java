package tutorial;

import java.util.Scanner;

public class ConeVol{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius:");
		float rad = sc.nextFloat();
		System.out.println("Enter the height of the cone:");
		float h = sc.nextFloat();
		double Vol = 3.14*rad*rad*(h/3);
		System.out.println("Volume of a cone is:"+Vol);
	}
}