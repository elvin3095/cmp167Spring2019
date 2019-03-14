/* Elvin Trejo
 * March 14/ 2019
 */


import java.util.Scanner;
public class RecArea {
	
	static Scanner input = new Scanner(System.in);
	/*
	 * getRecArea : int
	 * inputs: width: int, length: int
	 */
	 public static int getRecArea(int width, int length) {
		 return width * length; 
	 
	 }
	 public static void main(String[] args) {
		 System.out.println("Enter width and length: ");
		 int width = input.nextInt();
		 int length = input.nextInt();
		 
		 int area = getRecArea(width, length);
		 
		 System.out.println("area: "+area);
}
}