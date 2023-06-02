package chapter13.ex04;

import java.util.Set;
import java.util.TreeSet;

class MyClass1 implements Comparable<MyClass1> {
	int data1;
	int data2;
	
	// 생성자로부터 필드 값 할당
	MyClass1(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public String toString() {
		return data1 + "";
	}

	@Override
	public int compareTo(MyClass1 o) {
		return this.data1;
	}

}

class MyClass2 implements Comparable<MyClass2> {	//TreeSet에 정렬하여 저장하도록 설정.
	int data1;	// 정렬
	int data2;
	
	// 생성자로부터 필드 값 할당
	MyClass2(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	@Override
	public String toString() {
		return data1 + "";
	}

	@Override
	public int compareTo(MyClass2 o) {
		// ASC
		if (this.data1 < o.data1) {
			return -1;
		}else if (this.data1 == o.data1) {
			return 0;
		}else return 1;
		
		// DESC
//		if (this.data1 < o.data1) {
//			return 1;
//		}else if (this.data1 == o.data1) {
//			return 0;
//		}else return -1;
	}
	
}

class MyClass3 implements Comparable<MyClass3> {
	String data1;
	String data2;
	
	MyClass3(String data1, String data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
		
	@Override
	public int compareTo(MyClass3 o) {
		// 문자열 정렬 방법 1
//		return (this.data1.compareTo(o.data1));					// 오름차순 정렬
		// 방법 2
		if (this.data1.charAt(0) < o.data1.charAt(0)) {
			return 1;
		} else if (this.data1.charAt(0) == o.data1.charAt(0)) {		// ( == : 중복이 제거됨, < : 중복제거 없이 정렬 )
			return 0;
		}else return -1;										// 내림차순 정렬
	}

	@Override
	public String toString() {
		return data1 + "";
	}
	
}

public class Set_TreeSet_Class {
	public static void main(String[] args) {
		/*
			TreeSet<E>
			1. generic Type으로 Set<E> Interface를 구현한 클래스.
				- Set<E>의 특징을 가짐. ( 중복 불가능, Index 없음 )
			2. 값을 정렬하여 저장. ( default : asc )
			3. 검색, 정렬 관련 메소드가 있다.
				- Wrapper class는 정렬해서 저장 하도록 설정되어있다.
				- 일반 클래스를 TreeSet에 저장할 때, 특정 column 을
				정렬해서 저장하려면 Comparable<E> 인터페이스를 구현하여
				compareTo() 메소드를 오버라이딩 하여 정렬 하도록 구현해야 한다.
		 */
		
//		Wrapper Class
		Set<String> set1 = new TreeSet<>();
		set1.add("하");
		set1.add("바");
		set1.add("나");
		set1.add("나");	// 중복 허용하지 않는다.
		System.out.println(set1);	// 오름차순 정렬되어 저장.
		
		Set<Integer> set2 = new TreeSet<>();
		set2.add(10);
		set2.add(8);
		set2.add(5);
		set2.add(5);	// 중복 허용하지 않는다.
		System.out.println(set2);	// 오름차순 정렬되어 저장.
		System.out.println("----------");
		//////////////////////////////////////////////////////////
		
		/*
		 * 정렬
		 * - Comparable<E> Interface를 구현, compareTo() 를 재정의 하여 사용.
		 * 중복처리
		 * - equals(), hashCode() 를 재정의 하여 사용.
		 */
		
		// MyClass1 : 일반클래스, TreeSet에 객체 저장 시 정렬되지 않음.
		Set<MyClass1> mySet1 = new TreeSet<>();
		mySet1.add(new MyClass1(1,1));
		mySet1.add(new MyClass1(5,5));
		mySet1.add(new MyClass1(10,10));
		mySet1.add(new MyClass1(3,3));
		
		System.out.println(mySet1);
		
		
		// MyClass2 : Comparable 인터페이스의 compareTo() 메소드를 재정의,
		//			TreeSet에 객체를 정렬하여 저장.
		
		Set<MyClass2> mySet2 = new TreeSet<>();
		mySet2.add(new MyClass2(1, 1));
		mySet2.add(new MyClass2(5, 5));
		mySet2.add(new MyClass2(10, 10));
		mySet2.add(new MyClass2(3, 3));
		
		System.out.println(mySet2);
		System.out.println("----------");
		
		Set<MyClass3> mySet3 = new TreeSet<>();
		mySet3.add(new MyClass3("다", null));	// data2를 비교하게되면 error 발생 (null값은 비교할수 없기 때문)
		mySet3.add(new MyClass3("가","가"));
		mySet3.add(new MyClass3("라","라"));
		mySet3.add(new MyClass3("나","나"));
		mySet3.add(new MyClass3("나","나"));
		mySet3.add(new MyClass3("나","나"));
		System.out.println(mySet3);
	}
}
