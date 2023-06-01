package chapter13.ex04;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//hashCode(), equals() 재정의 하지 않음.
class A {
	int data ;
	
	A(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return data + "";
	}	
}

//hashCode(), equals() 재정의.
class B {
	int data ;
	
	B(int data) {
		this.data = data;
	}
	// equals() 재정의.
		// Object의 equals() 는 stack의 주소를 비교, == 와 같은 역할.
		// data field 의 heap의 값을 비교하도록 재정의.
	@Override
	public boolean equals(Object obj) {
		if ( obj instanceof B ) { // 다운캐스팅 하기전에 타입이 존재여부 확인.
			if (this.data == ((B)obj).data) {	// obj로 들어온 data가 class B 의 data와 같으면 true
				return true;
			}
		}return false;	// data가 같지 않으면 false.
	}
	
	// hashCode() 재정의.
		// data field의 값으로 hashCode 생성하도록 재정의.
		// data field의 값이 동일하면 동일한 hashCode() 반환.
	@Override
	public int hashCode() {
		return Objects.hash(data);		// data field 의 값으로 hashCode 생성.
	}
	
	@Override
	public String toString() {
		return data+"";
	}
}


public class Set_Machanism {
	public static void main(String[] args) {
		/*
			Set<E>
			1. index가 없다.
			2. 값 중복 불가능.
				- Wrapper Class : Boolean, Byte, Short, Integer, Long, Float, Double, Character, String
				- Wrapper class 외에 생성한 class 사용 시, Set 에 중복된 값을 넣지 못하도록 하려면 Object의 hashCode(), equals() 를 재정의 해야 한다.
		 */
		
		// 1. Wrapper class 예시.
		Set<Integer> hashSet1 = new HashSet<>();
		hashSet1.add(7);hashSet1.add(10);hashSet1.add(13);hashSet1.add(10);hashSet1.add(13);
		System.out.println("hashSet1 : " + hashSet1);	// 중복 없이 저장.
		System.out.println("hashSet1.size() : " + hashSet1.size());
		
		// 2. Wrapper class 가 아닌 경우.
		Set<A> hashSet2 = new HashSet<>();
		hashSet2.add(new A(20));hashSet2.add(new A(20));hashSet2.add(new A(20));
		
		System.out.println("hashSet2 : " + hashSet2);			// 중복 저장 되었다.
		System.out.println("hashSet2.size() : " + hashSet2.size());
		
		// 3. hashCode(), equals() 재정의한 B 클래스
		Set<B> hashSet3 = new HashSet<>();
		hashSet3.add(new B(30));hashSet3.add(new B(30));hashSet3.add(new B(30));
		
		System.out.println("hashSet3 : " + hashSet3);
		System.out.println("hashSet3.size() : " + hashSet3.size());
	}
}
