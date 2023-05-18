package chapter08.ex01;

import chapter08.ex02.A;

public class A_Test03 extends A{			// A : 부모클래스 , A_Test03 : 자식클래스 상속관계
	
	// 부모 클래스 A의 필드 중 public 과 protected 만 접근 가능.
	int k = pubf;	// public
	int l = prof;	// protected
//	int m = dftf;	// default
//	int n = prif;	// private
	
	// 상속된 메소드 2개 ( pub, pro )
	
	
	public static void main(String[] args) {

		A_Test03 t1 = new A_Test03();
		
		System.out.println(t1.pubf);	// A클래스(부모)의 필드 (public) 
		System.out.println(t1.prof);	// A클래스(부모)의 필드 (protected) 
		t1.pub();
		t1.pro();
	}
}
