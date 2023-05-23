package chapter09.ex04;

class AAA {
	static void print() {
		System.out.println("AAA - print()");
	}
	void print2() {
		System.out.println("AAA - print2()");
	}
}
class BBB extends AAA {
	static void print() {
		System.out.println("BBB - print()");
	}
	void print2() {
		System.out.println("BBB - print2()");
	}
	void bmove() {
		System.out.println("b move");
	}
}

public class Overriding_Static_Method {
	public static void main(String[] args) {
		// static method : class 영역에 실행코드를 가지고 있다. Override 되지 않음.
//		BBB.print();
//		AAA.print();
		AAA aaa = new BBB();
//		aaa.print();			// AAA 의 static method 실행.
		aaa.print2();			// override 된 BBB의 print2() 실행.
		System.out.println("==============");
		BBB bbb = (BBB)aaa;
		bbb.bmove();
//		bbb.print();
		bbb.print2();
		
	}
}
