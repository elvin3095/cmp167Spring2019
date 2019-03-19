/* Elvin Trejo
 * 3/19/2019
 * Review
 */


import java.util.Scanner;
public class Review {

	public static Scanner input = new Scanner(System.in);
	
	public static void greet(){
	System.out.println("************************************************");
	System.out.print("Welcome to the review: ");
	System.out.println("***************************************************");
	}
	
	public static void title() {

		System.out.println("What is your Name: ");
		String name = input.next();
		greet();
		
		if(name.endsWith("e")|| name.endsWith("a")) {
			System.out.println("Miss "+ name);
			
		}else {
			System.out.println("Mister "+name);
			
		}
	}
	
	public static void greetPeople(int numOfPeople) {
		for(int i=0; i<numOfPeople; i++) {
			title();
		}
	}
	public static void main(String[] args) {
		
	System.out.println("Enter number of people");
	int num = input.nextInt();
	greetPeople(num);

	}
}
