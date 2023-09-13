package JavaCourse;

public class SwapVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "Alpha";
		String y= "Bravo";
		
		x=y;  //Assigning value of y to x
		
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
		
		
		//Now swapping each other values utilizing temp variable
		String a = "Alpha";
		String b= "Bravo";
		String temp;
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		
		

	}

}
