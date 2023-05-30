package chapter12.ex05;

// test class
class A {}
class B extends A {}
class C extends B {}
class D extends C {}

// generic class
class Goods <T> {	// T : 모든 타입 사용 가능. Wrapper class, 참조자료형
	private T t;	// if ) extends A : A를 상속받는 모든 클래스 사용 가능.

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

class Test {
	// 일반 메소드 : 메소드 args로 제너릭 타입 제한
	void method1(Goods<A> g) {}	// 1. 사용가능한 args를 A타입으로 제한
								// 자식클래스 ( B,C,D ) 적용 안됨.
	
	void method2(Goods<?> g) {}	// 2. 모든 타입 가능.
	void method3(Goods<? extends B> g) {}	// 3. B,C,D 타입 가능.
	void method4(Goods<? super B> g) {}		// 4. A, B 만 가능.
}


public class BoundedTypeOfMethodArgument {
	public static void main(String[] args) {
		/*
		 * generic class, generic method 가 아닌 일반 메소드에 args로 들어오는 타입 제한
		 */
		
		// Test 객체 생성
		Test t = new Test();
		
		// 1. method1
		t.method1(new Goods<>());
		t.method1(new Goods<A>());
//		t.method1(new Goods<B>());		// X
//		t.method1(new Goods<C>());		// X
		
		// 2. method2
		t.method2(new Goods<>());
		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());
		
		// 3. method3
		t.method3(new Goods<>());
		t.method3(new Goods<B>());
		t.method3(new Goods<C>());
		t.method3(new Goods<D>());
//		t.method3(new Goods<A>());		// X
		
		// 4. method4
		t.method4(new Goods<>());
		t.method4(new Goods<A>());
		t.method4(new Goods<B>());
//		t.method4(new Goods<C>());		// X
//		t.method4(new Goods<D>());		// X
		
		
		
		
		
		
		
	}
}
