/*
 * Elvin Trejo
 * Date: 2/21/2019
 * Desc: comparison operators
 */
import java.util.Scanner;
public class Agetitle {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int userAge; 
		
		System.out.println("please enter their age");
		userAge = input.nextInt();
		
		if (userAge > 25) {
			System.out.println("Adult");
		}
		else if((userAge >= 19) && (userAge <= 25)) {
			System.out.println("young adult");
		}
		else if (userAge < 19) {
			System.out.println("teen");
		}
	}
}
