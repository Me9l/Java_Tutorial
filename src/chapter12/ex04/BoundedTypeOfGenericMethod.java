package chapter12.ex04;

class Bound {	// 일반 클래스의 제네릭 메소드
	// Number class : 정수 (byte,short,int,long) 혹은 실수(float, double) 관련 부모 클래스
	// T : Byte, Short, Integer, Long, Float, Double 타입 사용 가능.
	
	public <T extends Number> void method1(T t) { // 정수나 실수만 처리하는 자료형만 사용 가능.
		System.out.println(t.intValue());
		System.out.println(t.byteValue());
		System.out.println(t.doubleValue());
		System.out.println(t.floatValue());
	}
}

// Interface : generic type 제한에서 다중 사용 가능.
	// < T extends IF1 & IF2 & IF3 >
	// 인터페이스로 제한하면 인터페이스를 구현한 하위의 모든 클래스가 타입으로 지정.

public class BoundedTypeOfGenericMethod {
	public static void main(String[] args) {
		/*
		 * 제네릭 메소드에서 타입 제한.
		 * 	- 타입 제한이 없을 때 : 모든 타입이 매개변수 인자로 오기 때문에 Object의 메소드만 사용 가능.
		 *  - 타입 제한 : 제한한 클래스의 메소드 사용 가능.
		 */
		
		Bound b = new Bound();
		b.<Double>method1(88.88);
		
		b.<Float>method1(3.14F);
		
		b.<Integer>method1(100);
	}
}
