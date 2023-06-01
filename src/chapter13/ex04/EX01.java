package chapter13.ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EX01 {
	public static void main(String[] args) {
		/*
		 * - for loop 로 1~100까지 HashSet 에 값을 저장.
		 * - Iterator 로 HashSet에 저장된 값 출력.
		 * - Enhanced for loop 를 사용한 출력.
		 * - HashSet의 값을 배열로 변환. for loop로 출력.
		 */

		Set<Integer> set = new HashSet<>();		// HashSet<Integer> set1 = new HashSet<>();
		System.out.println("Print Set");
		for (int i = 0; i < 100 ; i++) {
			set.add(i+1);
		}
		System.out.println(set);
		
		Iterator<Integer> iter = set.iterator();

		System.out.println("Print Iterator");
		while (iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		
		System.out.println("Print foreach loop");
		for (Integer i : set) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		Integer[] arr = set.toArray(new Integer[0]);
		System.out.println("Print Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}
}
