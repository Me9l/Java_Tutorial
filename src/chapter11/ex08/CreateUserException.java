package chapter11.ex08;

// 1. Exception.
class MyException extends Exception{

	// default constructor
	MyException() {
//		super();
	}
	// message control constructor
	MyException(String message) {
		super(message);
	}
	
}

// 2. runtime Exception.

class MyRTException extends RuntimeException {
	// default constructor
	MyRTException() {
		super();
	}
	// message control constructor
	MyRTException(String message) {		// 오류 메세지를 받아서 부모클래스에게 전달.
		super(message);
	}
}

// 3. 사용자 정의 예외 활용 예시.
class A {
	// 1. 사용자 정의 예외 객체 생성.
	MyException myEx1 = new MyException();		// 일반 예외 처리
	MyRTException myEx2 = new MyRTException();	// 실행 예외 처리
	
	MyException myExm = new MyException("checked exception : 예외 메세지");		// 오류메세지를 생성자에 넣어 처리하는 객체.
	MyRTException myRTm = new MyRTException("runtime exception : 런타임 예외");
	
	// 2. 예외 던지기 ( throw )
	
	// 정수 입력받아 70 이하이면 강제 예외 발생.
	void a1(int num) {
		try {
			if (num >= 70) {
				System.out.println("입력 : " + num + ". >>> PASS");
			}else {
				System.out.println("입력 : " + num + ". >>> Failed");
				// 강제 예외 발생
				throw myRTm;
			}
		} catch (MyRTException e) {
			System.out.println(e.getMessage());		// runtimeException 발생시 예외 출력.
		}
	}
	
	// a1() 호출하는 메소드
	void b1() {
		a1(60);
	}
	
	// Throws Exception
	void a2(int num) throws MyException {	// 호출단에서 예외 처리
		if ( num >= 70 ) {
			System.out.println("입력 : " + num + ". >>> PASS");
		} else {
			throw myEx1;
		}
	}
	
	void b2() {
			try {
				a2(60);
			} catch (MyRTException e) {
				System.out.println(e.getMessage());
			} catch (MyException e) {
				System.out.println(e.getMessage());
			}
	}
}

public class CreateUserException {
	public static void main(String[] args) {
		/*
		 * 사용자 정의 예외 : Java에서 제공되지 않는 예외 처리를 직접 정의하여 사용.
		 * 		- 일반 예외 (checked Exception)
		 * 		-- 컴파일 단계에서 예외 발생.
		 * 		-- Exception 을 상속받아 사용자 정의 예외 생성.
		 * 		-- 기본생성자, 오류메세지를 처리할 생성자를 만들어서 처리.
		 * 
		 * 		- 실행 예외 (runtime Exception)
		 * 		-- 실행 단계에서 예외 발생.
		 * 		-- RuntimeException 을 상속받아 사용자 정의 예외 생성.
		 */
		
		A a1 = new A();
		a1.b1();
		a1.a1(80);
		a1.b2();
//		try {
//			a1.a2(70);
//		} catch (MyException e) {
//			e.printStackTrace();
//		}
	}
}
