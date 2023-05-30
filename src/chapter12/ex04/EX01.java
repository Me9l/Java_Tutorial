package chapter12.ex04;

class Apple {
	String name = "Apple";
}

class Banana {
	String name = "Banana";
}

class Orange {
	String name = "Orange";

}

class Aaa <T> { // 모든타입을 받는 클래스
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}

class Bbb <T extends Apple> { // extends한 타입만 받는 클래스
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}

interface If1 {
	void ifPrint1();
		// 자식클래스에서 구현 클래스를 만들고 사용하거나 익명 클래스로 구현.
}
interface If2 {
	void ifPrint2();
}
interface If3 {
	void ifPrint3();
}

class if1Impl implements If1 {
	@Override
	public void ifPrint1() {
		System.out.println("if1Imple > ifPrint1()");
	}
}

class extif1Impl extends if1Impl {
	
	@Override
	public void ifPrint1() {
		System.out.println("extif1Imple > ifprint1()");
	}

	public void extPrint() {
		System.out.println("if1Impl > extif1Impl > extPrint()");
	}
}
	//	generic class에서 interface를 사용한 타입 제한.
class EEE <T extends If1 > { // T : If1(+ if1Impl, extif1Impl ), If2, If3
	
	private T t ;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

// 제네릭 메소드에서 인터페이스 타입 사용 제한
class BB{
	public <T extends If1> void method1(T t) {
		t.ifPrint1();
	}
}


public class EX01 {

	public static void main(String[] args) {
		// Aa : 제네릭 타입에 모든 타입 적용 가능.
//		Aaa <String> a1 = new Aaa<>();
//		Aaa <Integer> a2 = new Aaa<>();
//		Aaa <Double> a3 = new Aaa<>();
//		Aaa <Apple> a4 = new Aaa<>();
//		Aaa <Banana> a5 = new Aaa<>();
//		Aaa <Orange> a6 = new Aaa<>();

		// Bb : extends한 타입만 적용.
		
//		Bbb <Double> b1 = new Bbb<>();
//		Bbb <Integer> b2 = new Bbb<>();
//		Bbb <Apple> b3 = new Bbb<>();	// 사용가능
//		Bbb <Orange> b4 = new Bbb<>();
//		Bbb <Banana> b5 = new Bbb<>();
//		Bbb <String> b6 = new Bbb<>();

		BB b1 = new BB();	// 인터페이스는 객체 생성 불가능. 자식클래스를 객체화 해서 인터페이스타입으로 사용(오버라이딩)은 가능.
		b1.<If1>method1(new if1Impl());
		b1.<If1>method1(new extif1Impl());
		
		// 제네릭 메소드 호출 : 익명 클래스로 호출
		// -- 인터페이스 메소드 호출시 자식이 override한 메소드 호출
		
		b1.<If1> method1 ( new If1() {
			@Override
			public void ifPrint1() {
				System.out.println("익명 클래스 override");
			}
		});
		
		b1.<If1> method1 (new if1Impl() {

			@Override
			public void ifPrint1() {
				super.ifPrint1();
				System.out.println("이것도 가능");
			}
		});

		b1.<If1> method1 (new extif1Impl() {
			
			@Override
			public void ifPrint1() {
				super.ifPrint1();
				System.out.println("If1 을 implements 한 if1Impl 을 extends 한 extif1Impl");
			}
		});
	}
}