package dataStructures;

import java.util.Arrays;

public class BinarySearchViaOwnFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// binary search = Search algorithm that finds the position
		//				   of a target value within a sorted array.
		//				   Half of the array is eliminated during each "step"
		
		
		int[] array= new int[10];
		int target =7;
		
		System.out.println("Array Length is: " +array.length); //The length data property of an Array instance represents the number of elements in that array. 
		
		//filling the array with elements from 0 to 9; 1st element is 0 and last element is 9 int array []= {0,1,2,3,4,5,6,7,8,9}
		for(int i =0; i<array.length; i++) {
			array[i]=i; //one can ignore the curly brackets, if it is just one line
//			System.out.println(i);  // 
		}
		
		int index = binarySearch(array, target);
		
		if(index==-1) {
			
			System.out.println("Array not found");
		}
		
		else {
			
			System.out.println("Target element found at:" + index);
		}
		
		
		
	}

	private static int binarySearch(int[] array, int target) {
		// TODO Auto-generated method stub
		
		int low=0;  //low index
		int high= array.length - 1; //High index; 9
		
		while(low <= high) {
			
			int middleIndex = low + (high-low) / 2;
			System.out.println("middleValue "+ middleIndex);
			int value = array[middleIndex];
			System.out.println("Value @ middleIndex "+ value);
			
			
			
			if(value < target) low = middleIndex + 1;
			else if(value > target) high = middleIndex - 1;
			else return middleIndex; //target found when target and middleIndex is same
		}
		
		
		return -1; //A way of saying that value is not found
	}

}
