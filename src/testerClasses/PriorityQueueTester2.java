package testerClasses;

import priorityQueue.HeapListPriorityQueue;
import priorityQueue.HeapPriorityQueue;
import priorityQueue.SortedListPriorityQueue;
import priorityQueue.UnsortedListPriorityQueue;
import priorityQueueInterfaces.PriorityQueue;

public class PriorityQueueTester2 {

	public static void main(String[] args) {
		Integer[] arr = {8, 89, 4, 8, 56, 34, 10, 24, 11, 12, 89, 70, 21, 100, 23, 2, 1, 9, 11, 77, 75, 86, 
				90, 15, 18, 23, 22, 17, 0, 33, 87, 55, 43, 87, 32, 37, 16, 90, 40, 30, 50, 70}; 
		
		PriorityQueue<Integer, Integer> pq; 
		
		pq = new UnsortedListPriorityQueue<Integer, Integer>(new IntegerComparator1());    // 1
//		pq = new SortedListPriorityQueue<Integer, Integer>(new IntegerComparator1());    // 2
//		pq = new HeapListPriorityQueue<Integer, Integer>(new IntegerComparator1());      // 3
//		pq = new HeapPriorityQueue<Integer, Integer>(new IntegerComparator1());          // 4

		/**EX8: THE CONTENTS OF THE ARRAY AFTER THE OPERATION IS DONE, IS SORTED IN A DECREASING WAY FOR COMP2 WHERE AS FOR COMP1, THEY ARE SORTED IN AN INCREASING WAY
		 * 
		 */
//		pq = new UnsortedListPriorityQueue<Integer, Integer>(new IntegerComparator2());    // 1
//		pq = new SortedListPriorityQueue<Integer, Integer>(new IntegerComparator2());    // 2
//		pq = new HeapListPriorityQueue<Integer, Integer>(new IntegerComparator2());      // 3
//		pq = new HeapPriorityQueue<Integer, Integer>(new IntegerComparator2());          // 4

		
		TesterUtils.displayArray("Content of the array before ", arr); 
		TesterUtils.what(arr, pq); 
		TesterUtils.displayArray("Content of the array after ", arr); 
	}

}
