package testProject;

public class testProject {


	
	public void add(int x, int y, int z) {
		
		
	
		int result = x+y+z;
		
		System.out.println("\nThe sum of the above mentioned marks is "+ result);
		
		
		if(result<0 || result>100) {
			
			System.out.println("Stay in the limit to keep the total marks less than 100");
			
		}
		
		
		
		

}
	
	public void loop(int a, int b, int counter) {
		
		int sum = a+b+counter;
		
		if(sum>90) {
			
		System.out.println("\nExcellent Result");
			
								
		}
			else if(sum>70 && sum<90) {
			System.out.println("\n Good Result");
		}
		
			else {
			System.out.println("\n You need to improve your result!!");
			}
		
		
		
		System.out.println("\nLet's count till:  " + counter);
		
		for(int i=0; i<=counter;i++) 
		{
			
			System.out.println(i);
			
		}
		
		
		
		
		

}
	
	public void remainder() {
		
		
		
		int x=10;
		int y=7;
		
		double remainder = x/y;
		System.out.println(remainder);
		
		
	
	
}
	
}


	
