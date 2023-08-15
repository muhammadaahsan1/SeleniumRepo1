

public class CarEncapsulation {

	private String make;
	private String color;
	private int year;
	
//	Making a constructor; A constructor in Java is similar to a method that is invoked when an object of the class is created.
	CarEncapsulation(String make, String color, int year){
		
		this.setMake(make);
		this.setColor(color);
		this.setYear(year);
	
				
		}
	
	//Using getter method, as without it one cannot access private variables, declared above, in other class
	//so making getter method for each of our variable that is private
	
	public String getMake() {
		return make;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getYear() {
		return year;
	}
	
   //	Using setter method, as without it one not have different values of private variables, declared above, in other class. The orginal values of variables here however will remain same
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	

}
