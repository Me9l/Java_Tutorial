package chapter10.ex01;

class Aa {
	void p() {
		// 자식 클래스에서 Override 가능.
		System.out.println("Aa > p()");
	}
	final void f() {
		// Override 불가능.
		// 중요한 메소드 정의시. 자식 클래스에서 수정하지 못하도록 설정.
		System.out.println("Aa > f()");
	}
}

class Bb extends Aa {
	@Override
	void p() {
		System.out.println("Bb > p()");
	}
//	final void f() {}		// Override 불가능.
}

public class Final_Method {
	public static void main(String[] args) {
		/*
			final method : 자식클래스에서 override 불가능.
		 */
	}
}
