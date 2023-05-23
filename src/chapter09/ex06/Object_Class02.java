package chapter09.ex06;

class Aa {
	String name;
	Aa(String name) {
		this.name= name;
	};
}
class Bb {
	String name;
	
	Bb (String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((Bb)obj).name) {
			return true;
		}else return false;
	}
	
}
public class Object_Class02 {
	public static void main(String[] args) {
		/*
		 * Object class 의 equals():Heap의 값을 비교하는 것이 아니라 stack 의 주소를 비교.
		 * Heap의 값을 비교하도록 재 정의해서 주로 사용.
		 * String은 equals() method가 Heap의 값을 비교하도록 설정되어있다.
		 */
		
		Aa a1 = new Aa("ㅎㅇ");
		Aa a2 = new Aa("ㅎㅇ");
		
		System.out.println("a1 Stack 주소 : " + a1);
		System.out.println("a2 Stack 주소 : " + a2);
		System.out.println("a1 == a2 : " + (a1 == a2));			// stack에 저장된 heap의 주소를 비교
		System.out.println("a1.equals(a2) : " + a1.equals(a2));
		System.out.println("--------------------------");
		String s1 = new String("ㅎㅇ");
		String s2 = new String("ㅎㅇ");
		
		System.out.println("s1 : " + s1);
		System.out.println("s2.toString() : " + s2.toString());
		System.out.println("s1 == s2 : " + s1 == s2);
		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		System.out.println("--------------------------");
		
		Bb b1 = new Bb("gd");
		Bb b2 = new Bb("gd");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1 == b2);		// false	// stack 주소 비교
		System.out.println(b1.equals(b2));	// true		// Heap의 값 비교
	}
}
