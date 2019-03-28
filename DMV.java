/*
 * Elvin Trejo
 * March 28, 2019
 * Motor Cicle DL
 */

import java.util.Scanner;
public class DMV {
	
	
	public static void generateDL(int age, boolean testPass) {
	
		if(testPass && age >= 17) {
			System.out.println("DL generated");
		}else {
			System.out.println(" you cannot generate DL");
		}	
	}
		public static int calulateExperitationDate(int yearGenerated) {
			return yearGenerated+10;
		}
		
		
		public static void main(String[] args) {
			generateDL(14, false);
			System.out.println(calulateExperitationDate(2011));
			
	}
}
	
	
