package whileLoops;

import java.util.Scanner;

public class DoWhileExercise {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner n= new Scanner(System.in);  //The nextInt() method of a Scanner object reads in a string of digits (characters) and converts them into an int type. The Scanner object reads the characters one by one until it has collected those that are used for one integer. Then it converts them into a 32-bit numeric value.
		 		 
		 Integer n1 = 1 ;
		 boolean result;
		
		do {
							
			System.out.print("Enter a number between 1 and 10: ");
			String name = n.nextLine();
				 			
				if(result = name.matches("[A-Za-z]*")) {
				
					System.out.println("You entered a string value ");
				
				
				} else {
					
					n1 = Integer.valueOf(name);
					
					}
										
			}while(n1>10 || n1<1 || result);
		
			
		    System.out.println(n1 + " is a number between 1 and 10" );

	}


		
	

}
