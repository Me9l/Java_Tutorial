package chapter09.ex05;

class AA {
	void abc() {
		System.out.println("class A - abc()");
	}
	void ab() {
		System.out.println("class A - ab()");
	}
}

class BB extends AA {

	@Override
	void abc() {
		super.abc();
		System.out.println("class B - abc()");
	}
	void bcd() {
		abc();		// this 생략 됨.
	}
	void cde() {
		super.abc();	// 부모 객체의 abc() 호출.
	}
	void def() {
		super.ab();		// 부모 객체의 ab() 호출.
	}
}

public class Super_Keyword02 {

	public static void main(String[] args) {

		BB bb = new BB();
		bb.ab();
		bb.abc();
		bb.bcd();		// this.abc();
		bb.cde();		// super.abc();
		bb.def();		// super.ab();
	}
}
