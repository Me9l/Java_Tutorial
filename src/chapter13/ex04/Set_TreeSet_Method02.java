package chapter13.ex04;

import java.util.*;

public class Set_TreeSet_Method02 {
	public static void main(String[] args) {
		/*
		 * TreeSet : Set<E>, SortedSet<E> (정렬), NavigableSet<E> (검색) 인터페이스를 구현한 클래스*
		 * 		-- TreeSet 을 객체화 해서 Set 타입으로 지정할 경우 Set의 메소드만 사용 가능.
		 * 		-- TreeSet 을 객체화 해서 TreeSet 타입으로 지정하면 정렬/검색 메소드 사용 가능.
		 * 		-- 값을 저장 할 때 오름차순 정렬되어 저장.
		 */
		
		
		TreeSet<Integer> treeSet = new TreeSet<>();		// class type TreeSet
		for (int i = 50; i > 0 ; i-=2) {
			treeSet.add(i);
		}
//		System.out.println(treeSet);		

		// Print with Iterator
		Iterator<Integer> ir = treeSet.iterator();		
		while (ir.hasNext()) {
			System.out.print(ir.next() + " ");
		}
		System.out.println();
		
		// TreeSet의 검색 기능 (조회).
		System.out.println("==========================");
		
		// 1. first() 	: TreeSet의 처음 값.
		System.out.println("treeSet.first() : "+treeSet.first());
		
		// 2. last() 	: TreeSet의 마지막 값.
		System.out.println("treeSet.last() : "+treeSet.last());
		
		// 3. lower(E element)	: element 보다 작은 값.
		System.out.println("treeSet.lower(25) : "+treeSet.lower(25));
		System.out.println("treeSet.lower(24) : "+treeSet.lower(24));
		
		// 4. higher(E element)	: element 보다 큰 값.
		System.out.println("treeSet.higher(25) : "+treeSet.higher(25));
		System.out.println("treeSet.higher(26) : "+treeSet.higher(26));
		
		// 5. floor(E element)	: element 를 포함해서 작은 값.
		System.out.println("treeSet.floor(25) : "+treeSet.floor(25));
		System.out.println("treeSet.floor(24) : "+treeSet.floor(24));
		
		// 6. ceiling(E element): element 를 포함해서 큰 값.
		System.out.println("treeSet.ceiling(25) : "+treeSet.ceiling(25));
		System.out.println("treeSet.ceiling(24) : "+treeSet.ceiling(24));
		
		// 값 가져오기.
		System.out.println("======================================");
		
		// 현재 treeSet 의 크기.
		int treeSetSize = treeSet.size();
		System.out.println("treeSetSize : " + treeSetSize);		// 25
		for (int i = 0; i < treeSet.size() ; i++) {
			System.out.print(treeSet.pollFirst() + " ");
		}
		System.out.println();
		System.out.println("======================================");
		
		// 가져 온 후 treeSet 의 크기.
		System.out.println("treeSet.size() : "+treeSet.size());			// 12
		
		// 8. pollLast() : 마지막 값 가져오기.
		System.out.println("현재 treeSet의 값\n"+treeSet);
		System.out.println("treeSet.pollLast() : "+treeSet.pollLast());
		System.out.println("가져온 후 \n"+treeSet+"\n");
		
		
		for ( int i = 50 ; i > 0 ; i-=2) {		// 중복되지 않기때문에 2,4,6 ... 50 까지 1개씩 저장.
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		// 9. SortedSet<E> headSet(E element) : element를 기준으로 Head 방향의 값을 정렬해서 저장.
		SortedSet<Integer> sSet = treeSet.headSet(20);
//		SortedSet<Integer> sSet1 = treeSet.headSet(20, true); // 사용 가능 (true시 20 포함)
		System.out.println(sSet);
		
		// 10. NavigableSet<E> headSet(E element) : element를 포함하여 Head 방향의 값을 저장.
		NavigableSet<Integer> nSet = treeSet.headSet(20,true); // true : 20을 포함, false : 20 미포함.
		System.out.println(nSet);
		
		// 11. SortedSet<E> tailSet(E element) : element를 포함하여 Tail 방향의 값을 정렬해서 저장.
		SortedSet<Integer> sortedTail = treeSet.tailSet(20);
		System.out.println(sortedTail);

		// 12. NavigableSet<E> tailSet(E element) : element를 기준으로 Tail 방향의 값을 정렬해서 저장.
		NavigableSet<Integer> navTail = treeSet.tailSet(20, false); // true : 20을 포함, false : 20 미포함.
		System.out.println(navTail);
		
		/*
		 * SortedSet의 .headSet(E element)는 head 방향으로 element를 포함하지 않고 저장.
		 * SortedSet의 .tailSet(E element)는 tail 방향으로 element를 포함하여 저장.
		 */
		
		System.out.println();
		
		// 특정 범위의 값 가져오기.
		// 13. SortedSet<E> .subSet(element, element);
		SortedSet<Integer> sSet1 = treeSet.subSet(10, 20);		// 10 부터 20 전까지(20미포함).
		System.out.println(sSet1);
		
		// 14. NavigableSet<E> .subSet(element, element);
		NavigableSet<Integer> nSet1 = treeSet.subSet(10, false, 20, true);	// true 포함, false 미포함.
		System.out.println(nSet1);
		
		// 15. 내림차순 정렬.
		NavigableSet<Integer> desc = treeSet.descendingSet();
		System.out.println(desc);
//		SortedSet<Integer> desc1 = treeSet.descendingSet();
//		System.out.println(desc1);
		
//		System.out.println(desc.descendingSet());
		
		NavigableSet<Integer> asc = desc.descendingSet();
		System.out.println(asc);
	}
}
