package testerClasses;


import priorityQueue.HeapListPriorityQueue;
import priorityQueue.HeapPriorityQueue;
import priorityQueue.SortedListPriorityQueue;
import priorityQueue.UnsortedListPriorityQueue;
import priorityQueueInterfaces.DisplayablePriorityQueue;
import priorityQueueInterfaces.PriorityQueue;

/**
 * 
 * @author pedroirivera-vega
 *
 */

public class PriorityQueueTester1 {
	
	public static void main(String[] args) {

		//DisplayablePriorityQueue<Integer, String> pq = new UnsortedListPriorityQueue<>(new IntegerComparator1());  //1
	
		//	DisplayablePriorityQueue<Integer, String> pq = new UnsortedListPriorityQueue<>(new IntegerComparator2());  //EX 4 //1
		
		/**FOR EX 4, WE ARE GOING TO GET DIFFERENT OUTPUTS BECAUSE OUR COMPARATOR IS DIFFERENT. FOR COMPARATOR1, WE COMPARED ELEMENT ONE TO ELEMENT TWO AND THE RESULT OF THAT COMPARISON WORKED WITH A
		 * SPECIFIC ORDER OF ELEMENTS FOR THE COMPARATOR2, ELEMENT TWO WAS COMPARED TO ELEMENT ONE, THUS CAUSING THE ORDER TO BE REVERSED AND THE RESULT OF EACH OPERATION THAT USES COMP2 TO BE OF A DIFFERENT ORDER WHICH RESULTS IN DIFFERENT OUTPUTS
		 * THE ORDER OF SOME NON CONTIGIOUS ELEMENTS THAT ARE DISPLAYED WERE CHANGED FROM COMP1 TO COMP2
		 */
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		//DisplayablePriorityQueue<Integer, String> pq = new SortedListPriorityQueue<>(new IntegerComparator1()); //EX5 //2
		
	DisplayablePriorityQueue<Integer, String> pq = new SortedListPriorityQueue<>(new IntegerComparator2());  //EX6 //2
		
		/**FOR EX 6, WE ARE GOING TO GET DIFFERENT OUTPUTS BECAUSE OUR COMPARATOR IS DIFFERENT. FOR COMPARATOR1, WE COMPARED ELEMENT ONE TO ELEMENT TWO AND THE RESULT OF THAT COMPARISON WORKED WITH A
		 * SPECIFIC ORDER OF ELEMENTS FOR THE COMPARATOR2, ELEMENT TWO WAS COMPARED TO ELEMENT ONE, THUS CAUSING THE ORDER TO BE REVERSED AND THE RESULT OF EACH OPERATION THAT USES COMP2 TO BE OF A DIFFERENT ORDER WHICH RESULTS IN DIFFERENT OUTPUTS
		 * THE ORDER OF ELEMENTS THAT WHERE CONTIGUOUS IN LIST WAS CHANGED
		 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//DisplayablePriorityQueue<Integer, String> pq = new HeapListPriorityQueue<>(new IntegerComparator1());    //3
		//DisplayablePriorityQueue<Integer, String> pq = new HeapPriorityQueue<>(new IntegerComparator1());        //4

		add(pq, 20, "twenty");
		removeMin(pq); 
		removeMin(pq); 
		add(pq, 10, "ten");
		add(pq, 22, "twenty two");
		add(pq, 7, "seven");
		add(pq, 13, "thirteen");
		add(pq, 23, "twenty three");
		add(pq, 100, "hundred");
		add(pq, 9, "nine"); 
		add(pq, 0, "zero");
		add(pq, 4, "four");
		add(pq, 8, "eight");
		add(pq, 3, "three");
		removeMin(pq); 
		removeMin(pq); 
		removeMin(pq); 
		add(pq, 9, "nine"); 
		add(pq, 0, "zero");
		add(pq, 4, "four");
		removeMin(pq); 
		removeMin(pq); 
		removeMin(pq); 

		makeEmpty(pq); 
	}
	
	private static void makeEmpty(DisplayablePriorityQueue<Integer, String> pq) {
		while (!pq.isEmpty()) 
			removeMin(pq); 
	}

	private static <K, V> void add(DisplayablePriorityQueue<K, V> pq, K key, V value) { 
		System.out.println("\nPQ content after adding entry: key = " + key 
				+ " and value = " + value); 
		pq.insert(key, value); 
		pq.display(); 
	}
	
	private static <K, V> void removeMin(DisplayablePriorityQueue<K, V> pq) { 
		System.out.println("\nPQ content after removing highest priority element " + pq.removeMin()); 
		pq.display(); 
	}

	

}