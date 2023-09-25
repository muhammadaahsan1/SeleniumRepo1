package dataStructures;

public class BubbleSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Bubble Sort
		 * 
		 * 1. is a sorting algorithm that checks adjascent element and checks whether they are in order, if not they are switched, then the next pair of adjascent elements is compared and we continue on that path until all elements are in order
		 * 2. not efficient for small dataset
		 * 3. Run time efficiency: O(n^2), not efficient with larger dataset, not even for smaller datat set
		 * // bubble sort = pairs of adjacent elements are compared, and the elements
	//		            swapped if they are not in order.
	
	//				 Quadratic time O(n^2)
	//				 small data set = okay-ish
	//				 large data set = BAD (plz don't)
		 */
		
		int[] array = {9,7,5,3,1};
		 System.out.print("Before Sorting: ");
		//listing all elements in the array just for fun
		for (int i:array)  //will read as: for int i in array
		{   
			System.out.print(i);
		}
		
		bubbleSort(array);
		System.out.print("\nAfter Sorting: ");
		for (int i:array)  //will read as: for int i in array
		{ 
			System.out.print(i);
		}
		

	}
	
	public static void bubbleSort(int array[]) {
		
		for (int i=0; i<array.length-1; i++) {
			for(int j=0; j<array.length-i-1; j++) {
				
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			
			
	}

}
	
}
