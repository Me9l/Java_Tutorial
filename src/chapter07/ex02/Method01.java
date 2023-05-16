package chapter07.ex02;

class A {
	int m ;
	int n ;
	
	// method : 호출을 통해 사용. input props을 가질 수 있다.
	
	void print() {	// 접근제어자 리턴타입 메소드명(변수타입 매개변수) {실행구문}
		// 실행구문
		System.out.println("int m field 의 값 : " + m );
		System.out.println("int n field 의 값 : " + n );
	}
	int plus (int a) {
		return a ;
	}
	int plus(int a,int b) {
		return a + b ;
	}
	
	double minus (double a, double b) {
		return a - b ;
	}
	
	String fullName (String fName, String lName ) {
		return lName + " " + fName;
	}
}

public class Method01 {
	public static void main(String[] args) {
		A a = new A();
		a.m = 1;
		a.n = 2;
		a.print();
		System.out.println(a.plus(3));
		System.out.println(a.plus(4, 5));
		
		System.out.println(a.minus(3.14, 1.14));
		
		System.out.println(a.fullName("바비", "킴"));
	}
}
