/*
 * Author: Elvin Trejo
 * Desc: StringOutputStream
 * Date: 2/19/2019
 */
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;
public class StringOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		StringWriter 	fullnameSW = new StringWriter();
		PrintWriter fullnamePW = new PrintWriter(fullnameSW);
		
		System.out.println("Please enter\" firstname lastname\": ");
		String word1 = input.next();
		String word2 = input.next();
		
		fullnamePW.print(word1 +", "+word2);
		
		 String fullname =fullnameSW.toString();
		 System.out.println(fullname);
		 
		
	}

}
