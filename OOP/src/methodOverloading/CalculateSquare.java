package methodOverloading;


	
	class CalculateSquare
	 { 
	public void square()
	 { 
	System.out.println("No Parameter Method Called");
	 } 
	public void square( int number )
	 {
	int square = number * number;
	System.out.println("Method with Integer Argument Called:"+square); 
	}
	public void square( float number ) 
	{
	 float square = number * number;
	 System.out.println("Method with float Argument Called:"+square); 
	}
	public static void main(String[] args)
	  {
	    CalculateSquare obj = new CalculateSquare();
	    obj.square();
	    obj.square(2.22f);   
	   
	  }
	 }


