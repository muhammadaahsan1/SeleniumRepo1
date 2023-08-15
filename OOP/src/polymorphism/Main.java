package polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// polymorphism= The ability of an object to identify as more than one type (you can say data type)
		//Steps 1. Create a Super Class(Vehicle), 3 subclasses(Car, Bicycle, Motorcar)
		// Step 2. Inside Super Class make a go method, but override it in each subclass
		//Step 3. Inside this current main class Create an array of objects having different type, but you use a type (can say data type) for this array as per something common between them; which is that they come under the category of vehicle
		
		Car car = new Car();
		Heavybike heavybike= new Heavybike();
		Ship ship = new Ship();
		
		
//		One way to call go methods from each of the subclass utilizing object and the methods they contain
		car.go();
		heavybike.go();
		ship.go();
		
//		Smarter way to call go methods utilizing array to found methods in each object and call them here
		Vehicle racers [] = {car, heavybike, ship}; //An array with type set to vehicle containing different object of different (data) types, An array of vehicles called racers
		
		
		//An enhanced for loop to iterate through all of the elements of this array of the vehicles
		for (Vehicle x: racers) {
			//x is counter here, racers is name of the array, 
			//x represents the Vehicle we are currently working with
			
			x.go();
		}
	
		//So polymorphism is the ability of an object to identify as more than one type (say datatype)
		// the car can also be identified as car as well as a vehicle
		//
	
	}

}
