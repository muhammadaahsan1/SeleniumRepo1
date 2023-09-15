package JavaCourse;

enum Planet{
	MERCURY, JUPITER, SATERN, EARTH, URANUS, VENUS, NEPTUNE, PLUTO
}

//enum can also contains numbers along with constants which can be called by introducing number along with data type

enum Days{
	MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
	

	int number;

	Days(int number){
	this.number=number;
	}
	

}



public class javaEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//enum: enumerated (ordered list of items in a collection)
		//enum is a grouping of constants that behave similarly to objects
		// name against enum should be descriptive of the constants that it contains
		//Two ways to create enum: 1. outside of main class along with its name and the constants it contains, 2. File>New>Enum(this creates Enum in a separate file)
		//Common practice for listing constants in Enum is that you want to be sure that all the letters are uppercase
		//You cannot change the constants inside Enum once the program runs and compiles
		
		
		//Instantiating an Enum, similar to instantiating an object except the new
		
		Planet myPlanet = Planet.VENUS;
		
		
		Days myDays = Days.FRIDAY;
		isItWeekend(myDays);
		
		canILiveHere(myPlanet);
		
	}
		
		static void canILiveHere(Planet myPlanet){
			
			switch(myPlanet) {
			case EARTH:
				System.out.println("This is liveable");
				
				break;
			default:
				System.out.println("You can't live here yet");
			}
			
		
		
		}
		
		
		
		
		static void isItWeekend(Days myDays) {
			
			switch(myDays) {
			case SATURDAY:
				System.out.println("It's Weekend");
				System.out.println("This is day number #" +myDays.number);
			case SUNDAY:
				System.out.println("It's Weekend");
				System.out.println("This is day number #" +myDays.number);
				break;
			default:
				System.out.println("It's not Weekend yet");
				System.out.println("This is day number #" +myDays.number);
			
			}
			
			}
		
			
		
}



		



//

