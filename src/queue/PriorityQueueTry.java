package queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer a, Integer b) {
		if(a>b) {
			return 1;
		}else {
			return -1;
		}
	}
	
}
public class PriorityQueueTry {
	public static void main(String[] args) {
		PriorityQueue<Integer> arr = new PriorityQueue<>(new MyComparator());
		//pq.add(5;)
		//List<Integer> arr = new ArrayList<>();
		arr.add(3);
		arr.add(1);
		arr.add(8);
		
		System.out.println(arr.poll());
		System.out.println(arr.poll());
		System.out.println(arr.poll());
	}
}
