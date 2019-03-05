import java.util.Scanner;

public class sumCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
  int n;
  int sum = 0;
  int counter = 0;
  
  System.out.println("please enter the natural numeber: ");
  	n = input.nextInt();
  	
  	while (counter < n){
  		counter++; 
  		sum  += counter; 
  		
  		System.out.println("the sum is " + sum);
  		
  		
  		
  	}
  
	}
}
