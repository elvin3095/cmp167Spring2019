import java.util.Scanner;
public class calArea {
	
	static Scanner input = new Scanner(System.in);
	public static void rectArea() {
		
	int width, length, area;
		 
	System.out.println("Enter width: ");
	width = input.nextInt();
	
	System.out.println("Enter length: ");
	length = input.nextInt();	
	
	area = width * length;
	
	System.out.println("The rectangle are is: "+area);
	
	}
	// CircleArea
	public static void circArea() {
		System.out.println("Enter radius: ");
		double radius = input.nextDouble();
		double circleArea = Math.PI * Math.pow(radius,2);
		
		System.out.println("The circlearea is: "+circleArea);	
	}
	// TriangleAre
	public static void trianArea() {
		System.out.println("Enter the triangleArea: ");
		
		System.out.println("Enter the hight: ");
		double hight = input.nextDouble();
		
		System.out.println("Enter the base: ");
		double base = input.nextDouble();
		
		double triangleArea = (hight * base) /2;
		System.out.println("The triangleAra is: "+triangleArea);
	}
	
	
	public static void main(String[] args) {
		rectArea(); 
		circArea();
		trianArea();
	}
}
