package chapter07.ex03;

class A {
	// field	( Heap 공간에 저장, 객체 생성(new) 후 Heap )
	int m, n ;
	
	// method
	void init(int a, int n) {	//method 내부에 선언된 변수 (지역변수 a,b,c)
		int c;
		c = 3;
		m = a;		// this 생략해도 컴파일시 자동 등록.
		this.n = n;	// 매개변수이름과 변수명이 같아서 this로 명시
		System.out.println("필드 값 : " + m + ", " + n + ", init 지역변수 c : " + c);
	}
	
	void work() {
		this.init(2, 3);
	}
}

public class This_ThisMethod {
	public static void main(String[] args) {
		/*
		this 키워드 : 필드앞,메소드명앞에 사용.
					자기자신의 객체를 의미.
					명시가 필요한 경우 : 생성자의 매개변수명, 받는이름, 필드명 등 중복이 발생할 때.
		this() 메소드 : 생성자 내부에서만 사용.
					반드시 생성자 내부에서 첫번째 라인에 위치.
					생성자 호출시 다른 생성자를 먼저 실행하도록 한다.
		 */
		
		A a = new A();
		a.work();
		
	}
}
