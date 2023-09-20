/*
 * small data set:	                                 LinkedList = BAD
   large data set + lots of searching:               LinkedList = BAD
   large data set + lots of inserting/deleting:      LinkedList = GOOD 
 * 
 */

package linkedLists;



import java.util.LinkedList;

public class LinkedListHandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // *****************************************************
		  // Linked list is a data structure that stores a series of nodes,
		  // LinkedList =  Nodes are in 2 parts (data + address)
		  //                        Nodes are in non-consecutive memory locations (it can be anywhere in your computer memory)
		  //                        Elements are linked using pointers
		  // Linked list are of 2 types; singly and doubly
		
			//                               Singly Linked List
		// 		Node                 Node                Node
		// 	[data | address] -> [data | address] -> [data | address]

		//                                 Doubly Linked List
		  //              Node                           Node
		//     [address | data| | address] <-> [address | data | address]
		
		  //    advantages?
		  //    1. Dynamic Data Structure (allocates needed memory while running)
		  //    2. Insertion and Deletion of Nodes is easy. O(1) 
		  //    3. No/Low memory waste
		  
		  //    disadvantages?
		  //    1. Greater memory usage (additional pointer)
		  //    2. No random access of elements (no index [i])
		  //    3. Accessing/searching elements is more time consuming. O(n)
		  
		  //    uses?
		  //    1. implement Stacks/Queues
		  //    2. GPS navigation
		  //    3. music playlist (your own playlist of songs)
		  //
		  
		  // *****************************************************

		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		/*
		// LinkedList as a Stack (First in Last Out or Last in First Out), for making a stack push method is used
		linkedList.push("A");
		linkedList.push("B");
		linkedList.push("C");
		linkedList.push("D");
		linkedList.push("F");
		linkedList.pop(); //will remove the top element on the stack
		
		System.out.println(linkedList);
		*/
		
		// LinkedList as a Queue (First in First Out, Last in Last Out)
		linkedList.offer("A");
		linkedList.offer("B");
		linkedList.offer("C");
		linkedList.offer("D");
		linkedList.offer("F");
		//linkedList.poll();		//will remove the first element of the queue
		
		linkedList.add(4, "E");
		System.out.println(linkedList);
		linkedList.remove("E");
		System.out.println(linkedList.indexOf("F"));
		
		
		System.out.println(linkedList.peekFirst());  //Will give the element in the first node of linked list
		System.out.println(linkedList.peekLast());   //Will give the element in the last node of linked list
		linkedList.addFirst("0");//adds the head to the queue
		System.out.println(linkedList);
		linkedList.addLast("1");//adds the tail to the queue
		System.out.println(linkedList);
		
		
		
		
		System.out.println(linkedList);
		
		
	}
	
	

}
