package JavaCourse;

import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double x;
		double y;
		double c;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x: ");
		x = scanner.nextDouble();
		
		System.out.println("Enter y: ");
		y = scanner.nextDouble();
		
		c=Math.sqrt((x*x)+(y*y));
		
		System.out.println("The hypotenuse is "+c);
		
		

	}

}
