package dataStructures;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// linear search = Iterate through a collection one element at a time
		/*
		 * Iterate through a collection one element at a time
			runtime complexity: O(n)
			
			Disadvantages:
				Slow for large data sets
			Advantages:
				Fast for searches of small to medium data sets 
				Does not need to sorted
				Useful for data structures that do not have random access (Linked List)
		 */
		int[] array = {6,9,1,7,5,4};
		
		
		int index = linearSearch(array, 4);
		
		if(index!=-1) {
			
			System.out.println("We have found the index: " + index);
		}
		
		else {
			System.out.println("Element not found");
		}

	}

	private static int linearSearch(int[] array, int value) {
		// TODO Auto-generated method stub
		
		for (int i=0; i < array.length; i++) {
			
			if(array[i]==value) {
				return i;
		}
			
		
	}
		return -1;

}
}
