package testerClasses;

import priorityQueue.HeapListPriorityQueue;
import priorityQueue.HeapPriorityQueue;
import priorityQueue.SortedListPriorityQueue;
import priorityQueue.UnsortedListPriorityQueue;
import priorityQueueInterfaces.PriorityQueue;

public class PriorityQueueTester3 {

	public static void main(String[] args) {
		String[] arr = {"barrio", "pepe", "julia", "maria", "oliva", "meme", "parada", "baile", "enjendro", 
		         "vagabundo", "nota", "tienda", "zapato", "caballo", "cafe", "diodo", "multiplica"}; 

			PriorityQueue<String, String> pq; 
			
	pq = new UnsortedListPriorityQueue<String, String>(new StringComparator1());    // 1 EX 9 //calls on an unsorted list priority queue of type string and string comparator 1

			
			
			//pq = new SortedListPriorityQueue<String, String>(new StringComparator1());    // 2
			//pq = new HeapListPriorityQueue<String, String>(new StringComparator1());     // 3
			//pq = new HeapPriorityQueue<String, String>(new StringComparator1());         // 4

//////////////////////////////////////DONE FOR FUN/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//pq = new UnsortedListPriorityQueue<String, String>(new StringComparator2());    // 1 EX 9 //calls on an unsorted list priority queue of type string and string comparator 1

			
			
			//pq = new SortedListPriorityQueue<String, String>(new StringComparator2());    // 2
			//pq = new HeapListPriorityQueue<String, String>(new StringComparator2());     // 3
			//pq = new HeapPriorityQueue<String, String>(new StringComparator2());         // 4

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			

TesterUtils.displayArray("Content of the array before ", arr); 
TesterUtils.what(arr, pq); 
TesterUtils.displayArray("Content of the array after ", arr); 
		
	}

}
