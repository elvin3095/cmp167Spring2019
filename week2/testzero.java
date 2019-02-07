/*
 * author: Elvin Trejo
 Created: 2/7/2019
 *Des: is a proyect to see the variable
  *  
  */
import java.util.Scanner;
public class testzero {

	public static void main(String[] args) {
		
		System.out.println("Enter three number of variable");
		
		 Scanner scnr = new Scanner(System.in);
	
		 double num1 = scnr.nextDouble();
		 double num2 = scnr.nextDouble();
		 double num3 = scnr.nextDouble();
		 
		 double avarage = (num1 + num2 +num3);
		 avarage = avarage / 3;
		 
		 System.out.println("Enter three number of variable is " + avarage );
				 
		
		

	}

}
