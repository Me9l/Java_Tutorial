package chapter08.ex02;

public class A {
//	constructor
	public A(){}

//	field
	public int pubf = 1;			// 다른 패키지 에서 접근 가능.
	protected int prof = 2;		// 같은 패키지 내에서 접근 가능.
	int dftf = 3;				// 같은 패키지 안의 외부 클래스 에서 접근 가능.
	private int prif = 4;		// 같은 클래스 내에서 접근 가능.

//	method
	public void pub() {
		System.out.println("public");
	}
	protected void pro() {
		System.out.println("protected");
	}
	void dft() {
		System.out.println("default");
	}
	private void pri() {
		System.out.println("private");
	}
	
	public static void main(String[] args) {
		
	}
}