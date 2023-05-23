package chapter10.ex01;

class A {
	int a = 1;			// field : Heap 에 변수와 값 저장. 수정 가능.
	final int B = 2;	// 상수 : 값 수정 불가. 대문자로 쓰는것이 관례.
	
	A() {
		a = 7;
//		B = 10;		// error
	}
	
	void p() {
		int c = 10;		// c : 지역 변수	
		final int D = 20;	// d : 지역 상수. 수정 불가.
		
		c = 20;
//		D = 30;		// error
	}
}

public class Final_Field {
	public static void main(String[] args) {
		/*
			Final Modifier (제어자)
			- final field(변수) : 정의된 값 변경 불가. (상수)
			- final method : 메소드 수정 불가. 오버라이딩 할 수 없다.
			- final class : 상속 할 수 없다. (상속받기 o, 상속 x)
		*/
	}
}