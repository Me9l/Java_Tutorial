package chapter08.ex01;

import chapter08.ex02.Student;

class A {					// default class이기 때문에 외부 패키지 에서 접근 불가능
	// 메소드에 접근제어자 선언
	// 접근 범위 : private < default < protected < public

	public void a() {		// public : 외부 패키지에서 접근 가능.
		
	}
	protected void c() {	// protected : 상속 관계일 때 외부 패키지에서 접근 가능.
		
	}
	void d() {				// default : 동일한 패키지 내에서만 접근 가능.
		
	}
	private void b() {		// private : 동일한 클래스 내에서만 접근 가능.
		
	}
	
	// 필드에 접근제어자 선언
	public int a;
	private int b;
	protected int c;
	int d;
}


public class Package {
	public static void main(String[] args) {
		/*
		 클래스 내부 구성도 : 1. 생성자, 2. 필드, 3. 메소드, 4. 이너 클래스( 클래스 내부 클래스)
		 클래스 외부 구성도 : 1. 패키지, 2. 임포트(import), 3, 외부 클래스
		 	- 1. 패키지 : 클래스(파일)를 조직화, (디렉토리)
		 		-- 같은 패키지 안에 동일한 이름의 클래스 생성 불가능.
		 	- 2. 임포트
		 		-- 동일한 패키지에 존재 하지 않는 클래스는 import하여 호출,사용.
		 		-- 외부의 클래스 속성 :  (public, class) 이어야 한다.
		 	- 3. 외부클래스 : 클래스 외부에 생성된 클래스, public class. 하나만 존재해야한다.
		 		-- public class 가 아니면 외부에서 접근 불가.
		 접근 제어자 : 정보를 보호하기 위해 클래스, 필드, 메소드 명 앞에 명시하는 제어자.
		 			   변수명 앞에는 사용 불가.
		 			   
		 		클래스 앞 ( public , default ) 사용가능
		 		필드 / 메소드 앞 ( public, protected, default, private )
		 			   
		 		-- public : 외부 패키지에서 접근 가능.
		 		-- protected : 상속 관계일때만 외부에서 접근 가능.
		 		-- private : 동일 클래스 내부에서 접근 가능.
		 		
		 */

		Car c1 = new Car();				// 같은 패키지에 존재 (import 없이 사용)
		Student s1 = new Student();		// 외부 패키지에 존재 (import 하여 사용)
// 외부 클래스를 사용 하기 위해서는 사용하려는 클래스의 접근제어자가 public 이어야 한다. (class, constructor)
		System.out.println(s1.sName);
		// import 없이 접근 방법 : 클래스전체 이름으로 접근 ( 패키지명.클래스명 )
//		chapter08.ex02.Student s2 = new chapter08.ex02.Student();
	}
}
