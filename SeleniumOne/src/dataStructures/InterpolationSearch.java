package dataStructures;

public class InterpolationSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Interpolation Search: 
		 * 	1. Best suited for uniformly distributed data i.e. {1,2,3,4,5}, {2,4,6,8,10}
		 *  2. Guesses where a value might be based on calculated probe results
		 *  3. If probe is incorrect, search area is narrowed, and a new probe is calculated
		 */
		
		int[] array = {1,2,3,4,5,6,7,8,9};
		
		int index = interpolationSearch(array, 8);
		
		if(index!=-1) {
			System.out.println("Our element is at index: "+ index);

			}
		else {
			System.out.println("element not found");}
		}
		
		
		
	

	private static int interpolationSearch(int[] array, int value) {
		// TODO Auto-generated method stub
		
		int low =0;
		//currently length is 7; length is the nr. of elements without from 1st element till last, 
		//array.lenght-1=index of last element
		int high= array.length-1; 
		
		
		while(value>=array[low] && value<=array[high] && low<=high) {
			//probe is like an estimate for index where the intended element might be present
			int probe = low + (high - low) * (value - array[low]) / 
				    (array[high] - array[low]);
			
			System.out.println("probe: " + probe);
			
			if(array[probe]==value) {
				return probe;
			}
			else if (array[probe]<value) {
				low=probe+1;
			}
			else {
			high =probe-1;
			
		}
		
		
		
	}
		return -1;

}}