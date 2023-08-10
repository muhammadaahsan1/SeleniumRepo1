package methodOverloading;



//Method Overloading: The concept of using the same method for 1. Different nr. of parameteres(here we have two, three and four parameters) or for 2. Different types of parameters (here we have double and int...)


 class Calculator {
	 
	 public int add(int n1, int n2) {
		 
		 return n1+n2;
	 }
	 
	 public int add(int n1, int n2, int n3) {
		 
		 return n1+n2+n3;
	 }
	 
	 
	 public double add(double n1, int n2) {
		 
		 return n1+n2;
	 }
	 
	 
	 
 }

public class MethodOverloading {
	
	public static void main(String a[]) {
		
		Calculator obj = new Calculator();
		double r1 = (double) obj.add(3, 4, 4);   //when you will give two integers here it will use the 1st method above, when 3 integers the second method, when two numbers having different types then using the third method 
		System.out.println(r1);
	}

}
