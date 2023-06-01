package chapter13.ex04;

import java.util.HashSet;
import java.util.LinkedHashSet;
//import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Set_Summary {
	public static void main(String[] args) {
		/*
		 * Set<E>
		 */
		
		Set<String> hSet = new HashSet<>();
		Set<String> lSet = new LinkedHashSet<>();
		Set<String> treeSet = new TreeSet<>();
		
		// HashSet		: 순서 없이 출력.
		hSet.add("라");
		hSet.add("다");
		hSet.add("나");
		hSet.add("가");
		System.out.println(hSet);
		
		// LinkedHashSet : 입력 순서대로 저장, 출력
		lSet.add("라");
		lSet.add("다");
		lSet.add("나");
		lSet.add("가");
		System.out.println(lSet);
		
		// TreeSet : 오름차순 정렬되어 저장, 출력
		treeSet.add("라");
		treeSet.add("다");
		treeSet.add("나");
		treeSet.add("가");
		System.out.println(treeSet);
		
//		HashSet<String> hset = new HashSet<>();
//		String id;
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.println("=============================");
//			System.out.println("1. 자료입력 | 2. 자료출력 | 3. 종료");
//			System.out.println("=============================");
//			int a ;
//			a = sc.nextInt();
//			if ( a == 1 ) {
//				System.out.print("입력할 자료의 수 입력 : ");
//				a = sc.nextInt();
//				for (int i = 0; i < a ; i++) {
//					System.out.print((i+1) + "번째 자료 입력 : ");
//					id = sc.next();
//					hset.add(id);
//				}
//			} else if ( a == 2 ) {
//				System.out.println(hset);				
//			} else if ( a == 3 ){
//				break;
//			}
//		}
	}
}
