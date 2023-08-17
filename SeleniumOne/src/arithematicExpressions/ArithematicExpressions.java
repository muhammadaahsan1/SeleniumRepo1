package arithematicExpressions;

public class ArithematicExpressions {
	
	//Public means that the method is visible and can  be called from other objects of other types

	//Static means that the method is associated with the class, not a specific instance (object) of that class. This means that you can call a static method without creating an object of the class

	//Void means that the method has no return value. If the method returned an int I will write int instead of void

	//The combination of above is seen on the main method mostly used for training


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// expression = operands and operators
		//operands = values, variables, numbers, quantity
		//operators = + - * / %
		
		int friends = 10;
		double candies = 7;
		
		//Sum//**
//		friends = friends +1;
//		friends+=1;
//		friends++;
//		friends = friends -1;
		
		
		
		//Multiplication//**
		
//		friends=friends*2;
//		friends*=2;
		
		
		//Division//**
		friends=friends/2;
//		friends/=2;
		// Note if you divide and it is not fully divisible i.e. their is a remainder, then the result is truncated, in case you want to see the decimal part use double 
		
		
		candies = (double) candies/3;
		
		System.out.println(candies);
		System.out.println();
				
		
		//Remainder//**
//		friends =friends%3;
	
		
		
		System.out.println(friends);
		
		int x; //declaration
		x=123; //assignment
		//both of above together are called initialization
		
		int y = 1234;

	}

}
