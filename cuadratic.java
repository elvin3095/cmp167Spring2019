package quadraticform;

/* Elvin Trejo;
 * created: 2/14/2018
 * desc: this program implements quadratic formula
 */
import java.util.Scanner;

public class cuadratic {
	public static void main(String[]args)
	{
		System.out.println("/t/tWelcome to Quadratic ");
		System.out.println("this program implements quadratic formula");
		
		Scanner input = new Scanner(System.in);
		
		double root1, root2;
		double a, b, c;
		double discr;
		
		System.out.println("Enter value of a:");
		a = input.nextDouble();
		System.out.println("Enter value of b:");
		b = input.nextDouble();
		System.out.println("Enter value of c:");
		c = input.nextDouble();
		
		discr = b*b - 4*a*c;
		root1 = (-b + Math.sqrt(discr))/2*a;
		root2 = (-b + Math.sqrt(discr))/2*a;
		
		System.out.println("the root 1 is "+ root1  + "the root 1 is " + root2);
		
	}

}
