package chapter07.ex01;

class A {	// 1. 생성자 , 2. 필드 , 3. 메소드 , 4. 이너클래스
	// 필드 : Heap에 저장
		// 인스턴스 필드 : non-static field , Heap에 저장, 객체화를 통해 사용.
			// 다른 객체와 공유되지 않음.
		// 정적(static) 필드 : class(static) 공간에 저장.
			// 객체화 하지 않고 클래스 호출로 사용 가능. 객체화로 사용 또한 가능.

	int instcfld ;			// 인스턴스필드, 해당 각체에서만 사용. Heap
	static int sttfld ;		// static field, 모든 객체에서 공유
	
}


public class Field01 {
	public static void main(String[] args) {
		A a = new A();
		A aa = new A();
		A aaa = new A();
		
		a.instcfld = 10 ;		// instance field 에 값 입력.
		aa.instcfld = 20 ;
		aaa.instcfld = 30 ;
		
		System.out.println(a.instcfld);
		System.out.println(aa.instcfld);
		System.out.println(aaa.instcfld+"\n--");
		
		a.sttfld = 10 ;			// static field : A class로 생성된 모든객체 모든객체가 공유.
		aa.sttfld = 20 ;
		aaa.sttfld = 30 ;
		
		System.out.println(a.sttfld);	// 30
		System.out.println(aa.sttfld);	// 30
		System.out.println(aaa.sttfld);	// 30
		
		A.sttfld = 10;
		System.out.println(A.sttfld);	// 10
		
		A b = new A();
		System.out.println(b.sttfld);	// 10
		
	}
}
