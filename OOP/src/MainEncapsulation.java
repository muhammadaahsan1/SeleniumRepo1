
public class MainEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Encapsulation: Hiding/Private attributes of a class to ensure security in a way that its orignial values can't be changed
				//				 Attributes can be accessed only through methods (getters & setters), setters can be utilized to change values in another class
			   //				 One should make the variables private if you don't have a reason to make them public/protected
				
//				Encapsulation explained great video https://www.youtube.com/watch?v=eboNNUADeIc
	
     //	Car Object, where we are passing the arguments
		CarEncapsulation car = new CarEncapsulation("Audi","White",2021);
//		System.out.println(car.make); // this will not return as Car.make is not visible instead you have to call public methods 
		
		System.out.println(car.getMake());
		System.out.println(car.getColor());
		System.out.println(car.getYear());
		
		
//		By calling setYear method we have changed the value of the year
		
		car.setYear(2023);
		car.setColor("Purple");
		car.setMake("Mercedez");
		
		
		System.out.println(car.getYear());
		System.out.println(car.getColor());
		System.out.println(car.getMake());
		
		
		
		
	
	}

}
