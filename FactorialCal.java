import java.util.Scanner;

public class FactorialCal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		int factorial = 1;
		int i; 		
		
		System.out.print("Enter the factorial of n: ");
		n = input.nextInt();
		
		for(i = 1; i <= n; ++i){
			factorial *= i;
		}
	System.out.print(factorial);
		
	}
}
