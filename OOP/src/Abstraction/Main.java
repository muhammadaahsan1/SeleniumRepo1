package Abstraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//abstract= abstract classes can't be instantiated, but they can have a subclass/childclass that can be
		//abstract keyword can be applied to both methods as well as classes
		//abstract methods are declared without an implementation(i.e. without a body), but a subclass/childclass has to implement it somewhere else
		//To prevent somebody from creation of instance of a class that is too vague, we can use abstract modifiers with that class
		
		
		//Vehicle vehicle = new Vehicle(); The object can't be created (i.e. class can't be instantiated as Vehicle class is abstract), hence a security being  added, in order to get this run we can have a vehicle instead we have to pick a certain type of vehicle i.e. child class of vehicle class whether it is a car, bike, cycle...
		
		
		Car car= new Car();
		car.go(1,2,3);
		
		
		Trucks truck = new Trucks();
		truck.go(1,2,4);
	}

}
