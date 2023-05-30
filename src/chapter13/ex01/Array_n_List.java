package chapter13.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_n_List {
	public static void main(String[] args) {
		/*
		 * 배열
		 	- 하나의 변수에 많은 값을 저장.
		 	- 배열에는 동일한 타입의 값을 저장한다.		ex) int[] arr = new int[5];
		 	- 배열 선언시 크기가 정해진다.				ex) String[] arr = new String[] {"A","B","C"}; (length : 3)
		 	- 배열 크기의 수정이 불가능하다.
		 	- 배열 중간의 값을 제거해도 크기가 작아지거나 늘지 않는다.
		 	
		 * 컬랙션(프레임워크)
		 	- 배열의 크기가 동적이다.
		 	- 동일한 타입의 값을 저장한다.
		 	- 제네릭 타입.
		 	- List<E> : Interface 이므로 객체화 할 수 없다.
		 		- index를 가진다.
		 		- ArrayList<E>, Vector<E>, LinkedList<E> 가 있다.
		 */
		
		// 1. 배열
		String[] arr = new String[] {"가","나","다","라","마","바","사"};
		System.out.println("배열의 값 : " + Arrays.toString(arr));
		System.out.println("배열의 길이 : " + arr.length);
		arr[2] = null;
		arr[5] = null;
		System.out.println("배열의 값 : " + Arrays.toString(arr));
		System.out.println("배열의 길이 : " + arr.length);
		System.out.println("-------------------------------");
		
		// 2. 컬랙션 List<E>
		List<String> aList = new ArrayList<String> ();
		
		System.out.println(aList.size());
		aList.add("A"); aList.add("B"); aList.add("B");
		System.out.println(aList.size());
		System.out.println(aList.toString());
	}
}
