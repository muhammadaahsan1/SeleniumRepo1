package dataStructures;

import java.util.Arrays;

public class BinarySearchUsingBuiltInBinaryMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// binary search = Search algorithm that finds the position
		//				   of a target value within a sorted array.
		//				   Half of the array is eliminated/disregarded during each "step"
		
		int[] array= new int[10];
		int target =7;
		
		System.out.println("Array Length is: " +array.length); //The length data property of an Array instance represents the number of elements in that array. 
		
		//filling the array with elements from 0 to 9; 1st element is 0 and last element is 9 int array []= {0,1,2,3,4,5,6,7,8,9}
		for(int i =0; i<array.length; i++) {
			array[i]=i; //one can ignore the curly brackets, if it is just one line
//			System.out.println(i);  // 
		}
		
		int index = Arrays.binarySearch(array, target);
		
		if(index==-1) {
			
			System.out.println("Array not found");
		}
		
		else {
			
			System.out.println("Target element found at:" + index);
		}
		
		
		
	}

}
