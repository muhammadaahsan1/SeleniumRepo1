package JavaCourse;

public class SwitchStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Unlike if-then and if-then-else statements, 
		 * the switch statement can have a number of possible execution paths. 
		 * A switch works with the byte, short, char, and int primitive data types. 
		 * It also works with enumerated types (discussed in Enum Types), the string class, 
		 * and a few special classes that wrap certain primitive types: Character, Byte, Short, and Integer (discussed in Numbers and Strings).
		 */
		
		
		
		String day="Salat";
		
		switch(day) {
		case "Sunday": System.out.println("It is Sunday");
		break;
		case "Tuesday": System.out.println("It is Tuesday");
		break;
		case "Wednesday": System.out.println("It is Wednesday");
		break;
		case "Thursday": System.out.println("It is Thursday");
		break;
		case "Friday": System.out.println("It is Friday");
		break;
		case "Saturday": System.out.println("It is Saturday");
		
		break;
		default:
		System.out.println("It is not a day");

		
		}

	}

}
