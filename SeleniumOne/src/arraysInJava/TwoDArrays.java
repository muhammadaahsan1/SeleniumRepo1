package arraysInJava;

import java.util.Arrays;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String bikers [][] = {{"car", "heavybike", "alpoha"}, {"carlkj", "lkheavybike", "alkjlklpoha"}};
		System.out.println(bikers[1][1]);
		
		
		System.out.println(Arrays.deepToString(bikers)); //Prints the whole 2D array

		
//		To print each element of 2D array
			
		for (String[] x : bikers)
		{
		   for (String y : x)
		   {
		        System.out.print(y + " ");
		   }
		   System.out.println();
		}
	}

}
