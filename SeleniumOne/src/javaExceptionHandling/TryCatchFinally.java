package javaExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//exception= events that occur during the normal flow of the program that,
		//			 disrupts the normal flow of the instructions
		// For handling exception, I have placed the dangerous part of the code in the try block, and in catch block I am handling exception, the finally block will print anyways
		// A good use of finally block is to close any scanners or files that might be opened
		Scanner scanner = new Scanner(System.in);
		try {
				
		
		System.out.println("Enter a whole number to divide:  ");
		int x = scanner.nextInt();
		
		
		System.out.println("Enter a whole number to divide by:  ");
		int y =scanner.nextInt();
		
		int result=x/y;
		
		System.out.println("\nResult of the division  "+ result);
		
		}
		
		
		catch(ArithmeticException e) {
			
			System.out.println("You can't divide a number by zero");
			
			
		}
		
		catch(InputMismatchException e1) {
			System.out.println("Please enter a number");
		}
		
		catch(Exception e) {
			
			System.out.println("There is something wrong other than exception handling we have in place");
		}
		
		finally {
			
			
		
			System.out.println("\nThis will print anyways");
			
			//finally block are normally used to close scanners or any opened files, but for closing scanner place scanner object outside the try block
			scanner.close();
			

	}

}
}
