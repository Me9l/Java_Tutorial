package chapter12.ex04;

// 타입 제한을 위한 클래스
class AA {
}

class B extends AA {
}

class C extends B {
}

class D<T extends B> { // T : B , C 만 처리 되도록 제한.
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}

class E<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}

public class BoundedTypeOfGeneric {
	public static void main(String[] args) {
		/*
		 * generic class로 들어오는 타입을 제한 할 수 있다. extends - 특정 클래스의 메소드를 매개변수로 들어오는 변수에서 사용
		 * 가능. - 제네릭 타입이 제한 되어 있지 않을 때 매개변수에 사용 가능한 메소드는 Object 클래스의 메소드만 사용 가능.
		 */

		// E클래스를 객체화 했을 때 T에 모든 타입 사용 가능.
//		E <String> e1 = new E<>();
//		E <Integer> e2 = new E<>();
//		E <Double> e3 = new E<>();
//		E <Character> e4 = new E<>();
//		E <A> e5 = new E<>();
//		E <B> e6 = new E<>();
//		E <C> e7 = new E<>();

		// D 클래스를 객체화 했을 때 T, C만 사용 가능)

//		D<C> d1 = new D<>();
	}
}