package chapter09.ex06;

class A {	//	class A extends Object : 최상위 클래스는 Object 상속받다.
	Integer a;
	String b;
	Double c;
	Boolean d;
	
	Object o;
}

class B extends A {
	int a ;
	int b ;
	int c ;
	
	@Override
	public String toString() {
		return "B [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
		
}

public class Object_Class01 {
	public static void main(String[] args) {
		/*
			Object class
				- java.lang.Object
				- java.lang 패키지의 모든 클래스는 import 없이 사용 가능.
				- 모든 자바 클래스는 Object 클래스의 자식. ( Object 클래스의 메소드를 상속 받는다. )
				- toString() : 객체 출력. ("패키지주소@메모리주소") 재정의 해서 객체 필드에 저장된 값을 출력하도록 사용.
		 */
		
		A a = new A();
		
		System.out.println(a.toString());
//		System.out.println(a.hashCode());
//		System.out.println(a.equals(a));
//		System.out.println(a.getClass());
		
		B b = new B();
		System.out.println(b.toString());	// toString() OVerride
		
	}
}
