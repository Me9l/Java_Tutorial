package chapter13.ex03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_n_LinkedList {
	public static void main(String[] args) {
		
		/*
		 * List<E>
		 * 		- ArrayList : 중간에 값을 넣을 경우 성능저하가 있을 수 있다.
		 * 		- LinkedList : 중간에 값을 넣어도 성능 차이 없지만 값 출력 성능이 ArrayList에 비해 느린편.
		 */
		
		List<Integer> aList = new ArrayList<>();
		List<Integer> lList = new LinkedList<>();
		Long startTime, endTime;

		// 1. ArrayList 값 입력 시간
		startTime = System.nanoTime();
//		System.out.println("시작시간 : " + startTime);
		
		for (int i = 0; i < 100000; i++) {
			aList.add(i);
		}
		endTime = System.nanoTime();
//		System.out.println("끝난시간 : " + endTime);
		System.out.println("ArrayList.add() : " + (endTime-startTime));
		System.out.println("--------------------");
		
		// 2. LinkedList 값 입력 시간
		startTime = System.nanoTime();
//		System.out.println("시작시간 : " + startTime);
		
		for (int i = 0; i < 100000; i++) {
			lList.add(i);
		}
		endTime = System.nanoTime();
//		System.out.println("끝난시간 : " + endTime);
		System.out.println("LinkedList.add() : " + (endTime-startTime));
		System.out.println("--------------------");
		
		// 3. ArrayList 값 검색 시간
		startTime = System.nanoTime();
//		System.out.println("시작시간 : " + startTime);
		for (int i = 0; i < aList.size(); i++) {
			aList.get(i);
		}
		endTime = System.nanoTime();
//		System.out.println("끝난시간 : " + endTime);
		System.out.println("ArrayList.get() : " + (endTime-startTime));
		System.out.println("--------------------");
		
		// 4. LinkedList 값 검색 시간
		startTime = System.nanoTime();
		System.out.println("시작시간 : " + startTime);
		for (int i = 0; i < aList.size(); i++) {
			lList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("끝난시간 : " + endTime);
		System.out.println("LinkedList.get() : " + (endTime-startTime));
		System.out.println("--------------------");
		
	}
}
