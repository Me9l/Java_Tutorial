package chapter13.ex01;

import java.util.List;
import java.util.Vector;

public class List_Vector_Method {
	public static void main(String[] args) {
		List<Integer> vectorList1 = new Vector<>();
		// add()
		for (int i = 0; i < 5; i++) {
			vectorList1.add(i+1);
		}
		System.out.println(vectorList1);
		
		// addAll()
		List<Integer> vectorList2 = new Vector<>();
		vectorList2.addAll(vectorList1);
		System.out.println(vectorList2);
		
		// set(int index, value)
		vectorList2.set(0, 5);
		System.out.println(vectorList2);
		
		// remove(int index)
		vectorList2.remove(3);
		System.out.println(vectorList2);
		
		// clear()
		vectorList2.clear();
		System.out.println(vectorList2);
		
		// isEmpty()
		System.out.println(vectorList1.isEmpty());
		System.out.println(vectorList2.isEmpty());
	}
}
