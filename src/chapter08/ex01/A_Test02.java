package chapter08.ex01;

import chapter08.ex02.A;

public class A_Test02 {
	public static void main(String[] args) {
		/* 다른 패키지에 존재하는 클래스.
		 	public class A 와 다른 패키지.
		 	1. 전체 이름으로 클래스에 접근.
		 	2. import 를 통해 클래스에 접근.
		 */

		 // 1. 전체 이름으로 접근
//		 chapter08.ex02.A a1 = new chapter08.ex02.A();
		 
		 // 2. import로 접근
		 A a2 = new A();
		 System.out.println(a2.pubf);	// public
//		 System.out.println(a2.prof);	// protected (상속관계 설정하면 가능)
//		 System.out.println(a2.dftf);	// default
//		 System.out.println(a2.prif);	// private
		 
		 a2.pub();
//		 a2.pro();
//		 a2.dft();
//		 a2.pri();
	}
}
