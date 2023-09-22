package dataStructures;

public class DynamicArraysMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DynamicArray dynamicArray = new DynamicArray();
		
		dynamicArray.add("A");
		dynamicArray.add("B");
		dynamicArray.add("C");
		dynamicArray.add("D");
		dynamicArray.add("E");
		dynamicArray.add("F");
		
		dynamicArray.insert(0, "X");
		System.out.println(dynamicArray);
		System.out.println("size: " + dynamicArray.size);
		System.out.println("capacity: " + dynamicArray.capacity);
		System.out.println(dynamicArray.search("C"));
		
		
		System.out.println("\n**********************Shrinking***********************\n");
		
		
		
		dynamicArray.delete("A");
		dynamicArray.delete("D");
		dynamicArray.delete("E");
		dynamicArray.delete("F");
		
		System.out.println(dynamicArray.search("C"));
		dynamicArray.insert(0, "X");
		dynamicArray.delete("A");
		
		
		
		System.out.println(dynamicArray);
		System.out.println("empty: " + dynamicArray.isEmpty());
		System.out.println("size: " + dynamicArray.size);
		System.out.println("capacity: " + dynamicArray.capacity);
		System.out.println();

	}

}
