/*
 * 
 */


import java.util.Scanner;
public class CalAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		int n;
		int sum = 0;
		int avarage;
		int i;
		System.out.println("Plese enter the (n) ");
		n = input.nextInt(); 
		
		for(i = 1; i <= n; ++i){
		sum += i;
		
		}
		
		avarage = sum / n;
		System.out.println(avarage);
		
	}
}
