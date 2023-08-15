package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Inheritance= process where one class acquires, the attributes and methods of another
		// Childclasses/subclasses can acquire all the methods, variables of parent class without having them stated in child/subclass
		// 2 Benefits of Inheritance:1. all methods, properties of a class can be transferred to child/subclass, 2. sub/child class can further have unique values for each i.e. Vehicle is main class for listing common features, while Car subclass can have its unique door parameter and Bicycle subclass has it own unique pedals parameter
		
		
		Car car = new Car(); //Object being created from Car Class(subclass of Vehicle)
		car.go(); // the methods though not existed in Car subclass, were inherited from Vehicle Superclass, and here we are using those methods
		car.stop();
		
		System.out.println(car.doors);
		System.out.println(car.speed);
		
		
		
		Motorcycle motorcycle = new Motorcycle();
		motorcycle.go();
		motorcycle.stop();
		
		System.out.println(motorcycle.speed);
		System.out.println(motorcycle.headlight);
		System.out.println(motorcycle.wheels);
		
		

	}

}
