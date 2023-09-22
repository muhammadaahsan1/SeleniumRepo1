package dataStructures;

public class DynamicArray {
	
	int size; 
	int capacity = 10; //declared and instantiated capacity
	Object[] array; //declaring an array of objects named array but not instantiate it yet
	
	public DynamicArray() //overloaded constructor where we will instantiate new fixed size array
	{
		this.array = new Object[capacity];
	}
	public DynamicArray(int capacity) //overloaded constructor in case the capacity is coming from the user> main method; DynamicArraysMain
	{
		this.capacity = capacity;
		this.array = new Object[capacity];
	}
	
     public Object get(int index) {
            return array[index];
        }
	
	public void add(Object data) //data is parameter of Object
	{
		
		if(size >= capacity) //to check if we are at capacity, if so then grow should be called to increase the capacity of existing inner static array by 2x i.e. expand the existing array
		{
			grow();
		}
		//if not at capacity add the data at the end of the array, hence the size of the array will increase as an element is added
		
		array[size] = data;
		size++;
	}
	
	public void insert(int index, Object data) //taking two parameters index and data, index and data is coming from main method
	{
		
		if(size >= capacity) 
		{
			grow();
		}
		for(int i = size; i > index; i--)  
		{
			array[i] = array[i - 1];
		}
		
		

		array[index] = data;
		
		size++;
		
		
	}
	
	public void delete(Object data) {
		
		for(int i = 0; i < size; i++) {
			if(array[i] == data) {
				for(int j = 0; j < (size - i - 1); j++){
					array[i + j] = array[i + j + 1];
				}
				array[size - 1] = null; // as elements are moved to the left, and the index is received by subtracting 1 from size as size doesn't starts from 0, the empty space on the right is assigned a null value
				size--;
				if(size <=(int) (capacity/3)) {
					shrink();
				}
				break;
			}
		}
	}
	
	public int search(Object data) {
		
		for(int i = 0; i < size; i++) {
			if(array[i] == data) {
				return i;
			}
		}
		return -1;
	}
	
	private void grow() {
		
		int newCapacity = (int)(capacity * 2);
		Object[] newArray = new Object[newCapacity];
		
//		copying elements to new array below
		
		for(int i = 0; i < size; i++) {
			newArray[i] = array[i];
		}
		capacity = newCapacity;
		array = newArray;
	}
	
	private void shrink() {
		
		int newCapacity = (int)(capacity / 2);
		Object[] newArray = new Object[newCapacity];
		
		for(int i = 0; i < size; i++) {
			newArray[i] = array[i];
		}
		capacity = newCapacity;
		array = newArray;
	}
	
	public boolean isEmpty() {
		return size == 0; // If size is anything but not zero, we will return false
	}
	
	public String toString() //method to display element of this array
	
	{
		
		String string = "";  //Declaring a local String variable named string
		
		for(int i=0; i<capacity; i++)//capacity to see entire array, you can also see the elements only using size i.e. i<size
		{
			
			string+= array[i]+ ", ";
		}
		
		if(string!="") //if string is not empty, lets get rid of comma and space above 
			{
			string = string.substring(0, string.length()-2);
			string = "["+string+"]"; //adding square brackets to show it as array
			}
		return string;
		}
	

}
