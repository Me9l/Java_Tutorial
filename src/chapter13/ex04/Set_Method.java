package chapter13.ex04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Method {
	public static void main(String[] args) {
		/*
		 * Set<E> : Interface, 객체화 불가능.
		 * : 선언메소드 --> 자식 클래스 ( 오버라이드 해서 구현. )
		 * : 인터페이스 메소드 호출시 자식 클래스의 오버라이딩된 메소드 동작.
		 * : 인덱스번호가 없다.
		 * : 중복된 값을 넣을 수 없다.

		 * - HashSet<E> : 랜덤하게 출력.
		 * - LinkedHashSet<E> : 넣은 순서대로 값 출력.
		 * - TreeSet<E> : 검색을 빠르게 하기 위해 사용.
			  	- 값을 저장할 때 정렬해서 저장.
			  	- 오름차순 : ASC , 내림차순 : DESC
		 */

		// Set
		Set<String> hSet1 = new HashSet<>();

		// 1. add
		hSet1.add("가");
		hSet1.add("나");
		hSet1.add("다");
		hSet1.add("가"); // 중복된 값은 저장되지 않는다.
		
		System.out.println("hSet1 : " + hSet1);	// 입력 순서에 상관없이 출력.
		
		// 2. addAll(다른 set 객체) : 다른 Set의 값을 저장. ( 중복을 허용하지 않음. )
		Set<String> hSet2 = new HashSet<>();
		hSet2.add("다");	// 중복값 ( 저장 되지 않는다. )
		hSet2.add("라");
		
		hSet2.addAll(hSet1);
		System.out.println("hSet2 : " + hSet2);
		
		// 3. remove(Object 0) : 값으로 삭제.
		hSet2.remove("가");
		System.out.println("hSet2 - '가' : " + hSet2);				// collection의 모든 구현체는 toString()이 재정의 되어 있다.
//		System.out.println(hSet2.toString());
		
		hSet2.removeAll(hSet1);
		System.out.println("hSet2 - hSet1 : " + hSet2);
		
		// 4. clear()	: 모든 값 제거.
		hSet2.clear();
		System.out.println("hSet2.clear() : " + hSet2);
		
		// 5. isEmpty() : 값이 없으면 true
		System.out.println("hSet2.isEmpty() : " + hSet2.isEmpty());
//		boolean bool = hSet2.isEmpty();
//		System.out.println(bool);
		
		// 6. contains(Object o) : 값이 있으면 true
		System.out.println("hSet2.contains('가') : " + hSet2.contains("가"));
		hSet2.add("가");
		System.out.println("hSet2.add('가') 후 : " + hSet2.contains("가"));
		System.out.println("----------------------------");
		
		Set<String> hSet3 = new HashSet<>();
		hSet3.add("가");
		hSet3.add("나");
		hSet3.add("다");
		
		System.out.println("hSet3 : " + hSet3);
		System.out.println("hSet3.contains(\"나\") : " + hSet3.contains("나"));
		System.out.println("hSet3.contains(\"라\") : " + hSet3.contains("라"));
		
		// 7. size() : 값의 수.
		System.out.println("hSet3.size() : " + hSet3.size());
		
		// 8. iterator를 사용해 값 출력.
			// hasNext() : set에 다음 값이 있으면 true
			// next() : 값을 출력하고 다음으로 이동.
		
		Iterator<String> iterator = hSet3.iterator();	// set객체를 iterator에 저장.
		while (iterator.hasNext()) {					// iterator의 다음 값 유무 확인.
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		System.out.println(hSet3.iterator().next());
		
		
		// 9. for each
		for (String string : hSet3) {
			System.out.print(string + " ");
		}
		System.out.println();
		
		// 10. toArray() : set에 저장된 값을 배열로 변환, Object[]를 리턴.
		Object[] obj = hSet3.toArray();
		for (int i = 0; i < obj.length; i++) {
			System.out.print(obj[i] + " ");
		}
		System.out.println();
		
		// 11. toArray(T[] t) : 타입을 지정하면 해당 타입으로 리턴.
		String[] str = hSet3.toArray(new String[0]);	// String[] 배열에 값 저장.
														// Set의 크기에 따라 크기 조절.
		
		System.out.println(Arrays.toString(str));
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
	}
}
