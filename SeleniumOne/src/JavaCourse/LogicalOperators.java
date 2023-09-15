package JavaCourse;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp=27;
		
		if(temp>30) {
			
			System.out.println("It is hot outside");
			
			
	}
		
		else if (temp>20 && temp<29) {
			
			System.out.println("It is medium temp");
		}
		
		else {
			
			System.out.println("It is cold outside");
		}
		
		orOperatorCheck() ;
		notOperatorCheck();

}
	
	static void orOperatorCheck() {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("You are playing a game tap q or Q to quit");
		String response= scanner.next();
		
		if(response.equals("q")||response.equals("Q")) {
			System.out.println("You quit the game");
		}
		
		else {
			System.out.println("You are still playing");
		}
	}
	
	static void notOperatorCheck() {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("You are playing a game tap q or Q to quit");
		String response= scanner.next();
		
		if(!response.equals("q") && !response.equals("Q")) {
			System.out.println("You are still playing");
			
		}
		
		else {
			System.out.println("You quit the game");
		}
	}
	
	
}
