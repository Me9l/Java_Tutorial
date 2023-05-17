package chapter07.ex03;

class C { // this() method를 사용하지 않고 생성자를 초기화.
	
	int m1, m2, m3, m4; // field
	// 기본 생성자
	C() {
		m1 = 1;	m2 = 2;	m3 = 3;	m4 = 4;
	}
	// arg 1개
	C(int a) {
		m1 = a;	m2 = 2;	m3 = 3;	m4 = 4;
	}
	// arg 2개
	C(int a, int b) {
		m1 = a;	m2 = b;	m3 = 3;	m4 = 4;
	}
	// arg 3개
	C(int a, int b, int c) {
		m1 = a; m2 = b; m3 = c; m4 = 4;
	}
	
	@Override
	public String toString() {
		return "C [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", m4=" + m4 + "]";
	}
}

class D { // this() method를 사용해서 생성자를 초기화.
	int m1, m2, m3, m4;
	
	D() {
		m1=1; m2=2; m3=3; m4=4;
	}
	
	D(int a) {
		this();		// 매개변수 없는 생성자 호출.
		m1 = a;
	}
	
	D(int a, int b) { //input된 a가 this(a)로 이동, D(int a) 생성자를 실행.
		this(a);
		m2 = b;
	}
	
	D(int a, int b, int c) {
		this(a,b);
		m3 = c;
	}
	
	@Override
	public String toString() {
		return "D [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", m4=" + m4 + "]";
	}
		
}

public class This_Method01 {
	public static void main(String[] args) {
		/*
		 * this() method - 생성자 내부에서만 사용. - 생성자 첫 라인에 위치. - 생성자 내부에서 다른 생성자를 호출 할 때 사용. -
		 * 시그니처에 따라 생성자 호출 ( args의 수, args의 타입 에 맞는 생성자 호출 )
		 */
		
		// C 클래스로 객체 생성, 생성자 호출 후 값 출력.
		C c1 = new C();						// 기본 생성자 호출
		C c2 = new C(10);					// 생성자 호출 (arg 1)
		C c3 = new C(100,200);				// 생성자 호출 (arg 2)
		C c4 = new C(1000,2000,3000);		// 생성자 호출 (arg 3)
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println("==============");
		
		D d1 = new D();
		D d2 = new D(10);
		D d3 = new D(111, 222);
		D d4 = new D(100,200,300);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
	}
}
