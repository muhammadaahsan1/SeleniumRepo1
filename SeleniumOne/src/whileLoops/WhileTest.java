package whileLoops;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while loop: executes a block of code as long as it's condition remains true 
		// The Scanner class is used to get user input, and it is found in the java.util package.
		//To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. In our example, we will use the nextLine() method, which is used to read Strings:
		
		Scanner scanner = new Scanner(System.in);	//create a scanner object
		String Namen = "";
		
		
		while(Namen.isBlank()) {
			
			System.out.print("Please tell your name: ");
			Namen = scanner.nextLine();

	}
		
		System.out.println("AoA "+ Namen);
		
		
		
		
		
		
		do{
			
			System.out.print("Was ist dein Namen");
			Namen =scanner.nextLine();
			
		} while(Namen.isBlank()) ;
		
		System.out.println("Guten Tag: "+ Namen);

}
	
}
