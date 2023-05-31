package chapter13.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_ArrayList_Method {
	public static void main(String[] args) {
		/*
		 *	 List<E> : Interface (선언 O , 구현 X)
		 *	 - Index가 있고, 값 중복 허용.
		 *		-- ArrayList<E> 	: 싱글 스레드 환경에 적합.
		 *		-- Vector<E>		: 모든 메소드가 동기화 처리되어 멀티스레드 환경에 적합.(값 수정이 잦은경우 부적합)
		 *			-- 배열 중간에 값을 추가/삭제 할 경우 부하에 걸리기 쉽다.
		 *		-- LinkedList<E>
		 *			-- 배열 중간에 값을 추가/삭제 해도 부하가 적다.
		 *			-- 빈번하게 값 수정이 되는경우
		 */
		
		// List 에서 사용되는 메소드
		
		// 자식 클래스를 객체화 해서 List 타입으로 선언 ( interface )
		List<Integer> listA = new ArrayList<>();
//		List<Integer> listB = new Vector<>();
//		List<Integer> listC = new LinkedList<>();
//
//		ArrayList<String> aList = new ArrayList<>();
//		Vector<String> bList = new Vector<>();
//		LinkedList<String> cList = new LinkedList<>();		
		
		
		// 메소드 //
		
		// 1 .add() : 값 추가
		listA.add(1);						// .add() : 배열 마지막에 값 추가.
		System.out.println("listA : \t"+listA);
		System.out.println("listA.size() :\t"+listA.size());	// .size() : 배열 크기
		// 2 .add(index, Element)
		listA.add(1, 2);					// .add(index, Element) : 해당 인덱스에 값 추가.
		System.out.println("listA : \t"+listA);
		System.out.println("listA.size() :\t"+listA.size());
		listA.add(1, 3);					// 해당 인덱스에 값이 있을 경우 뒤로 밀고 추가.
		System.out.println("listA : \t"+listA);
		System.out.println("listA.size() :\t"+listA.size());
		listA.add(2, 5);
		System.out.println("listA : \t"+listA);
		System.out.println("listA.size() :\t"+listA.size());
		// 3. addAll()
		List<Integer> listAA = new ArrayList<>();
		listAA.add(10);
		listAA.addAll(listA);				// .addAll() : 다른 배열객체의 값을 모두 추가.
		System.out.println("listAA : \t"+listAA);
		System.out.println("listAA.size() :\t"+listAA.size());
		
		// 4. addAll(int index, 객체)
		List<Integer> listAAA = new ArrayList<>();
		listAAA.add(1);
		System.out.println("listAAA : " + listAAA);
		listAAA.addAll(1, listAAA);			// 해당 인덱스에 객체의 모든 값 추가.
		System.out.println("listAAA : " + listAAA);
		
		// Collection : List, Set, Map
		
		// 5. set() : 값 수정
		listAAA.set(0, 2);		// .set(int index,value) : 해당 인덱스에 값 수정.
		System.out.println("listAAA : " + listAAA);
		// 6. remove(int index) : 해당 인덱스의 값 삭제. ( 해당 인덱스 뒤의 값들이 앞으로 당겨진다.)
		listAAA.remove(0);
		System.out.println("listAAA : " + listAAA);
		
		// 7. remove(Object o) : 값을 식별해서 삭제.
		listAAA.add(2);
		listAAA.add(3);
		listAAA.add(2);
		listAAA.add(4);
		listAAA.add(5);
		System.out.println(listAAA);
//		listAAA.remove(new Integer(2));
//		System.out.println(listAAA);
		
		// 8. removeAll()
//		listAAA.removeAll(listAAA);	// .removeAll(Object) : 값 모두 삭제.
//		System.out.println(listAAA);
		
		// 9. clear()
		listAAA.clear();			// .clear(); : 값 모두 제거.
		System.out.println(listAAA);
		
		// 10. isEmpty() : 값이 존재하지 않으면 true
		System.out.println(listAAA.isEmpty());
		
		// 리스트에 저장된 값 가져오기
		// 11. get(int index)
		
		for (int i = 0; i < listAA.size() ; i++) {
			System.out.print(listAA.get(i) + " ");
		}
		System.out.println();
		
		for (int i : listAA) {
			System.out.print(i + " ");
		}
		System.out.println();
		// 12. toArray()		: 리스트에 저장된 값을 배열로 반환.( return Type == Object )
		Object[] obj = listAA.toArray();
		System.out.println(Arrays.toString(obj));
		
		// 13. toArray(T[] t)	: 리스트를 배열로 반환할 때 해당 타입의 배열로 반환.
		
		Integer[] itg1 = listAA.toArray(new Integer[0]);	// [0] : 배열 크기 지정. 리스트 값이 있을 경우 자동으로 커진다.
//		Integer[] itg = listAA.toArray(new Integer[listAA.size()]);
		System.out.println(Arrays.toString(itg1));
		System.out.println(itg1.length);
		
		Integer[] itg2 = listAA.toArray(new Integer[10]);	// list의 size가 array의 length 보다 짧으면 나머지 배열은 null로 채워진다.
		System.out.println(Arrays.toString(itg2));
		System.out.println(itg2.length);
		
	}
}