package chapter08.ex02;

public class A_Test01 {
	public static void main(String[] args) {
		/* 동일한 패키지에 존재하는 클래스.
			public class A 는 동일한 패키지에 존재. (import 없이 사용 가능)
		 */
		
		A a1 = new A();
		System.out.println(a1.pubf);	// public field
		System.out.println(a1.prof);	// protected field
		System.out.println(a1.dftf);	// default field
//		System.out.println(a1.prif);	// private field (접근 불가)
		
		// 메소드 접근
		
		a1.pub();
		a1.pro();
		a1.dft();	
//		a1.pri();
		
	}
}
