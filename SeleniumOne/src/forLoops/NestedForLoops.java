package forLoops;

import java.util.Scanner;

public class NestedForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Nested Loops= A loop inside a loop
		
		Scanner scanner = new Scanner(System.in);
		
		int rows;
		int columns;
		String symbol ="";
		
		
		System.out.println("Enter the number of rows: ");
		rows=scanner.nextInt();
		
		System.out.println("Enter the number of columns");
		columns=scanner.nextInt();
		
		System.out.println("Enter the Symbol you want to print: ");
		symbol = scanner.next();
		
		for(int i=1; i<rows; i++) {
			
			System.out.println();
			
			for(int j=1; j<columns; j++) {
				
				System.out.print(symbol);				
				
			}
			
			
			
			
			
		}
		
		

	

	}
	
	
}

