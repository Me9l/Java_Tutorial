package chapter11.ex07;
/*
 * 예외 처리
 * Throws : method 를 호출하는 쪽에서 처리하도록 넘긴다.
 * 일반 예외 (checked Exception) 는 반드시 처리해야 한다.
 * 실행 예외 (runtime Exception) 은 컴파일단계에서 에러가 발생하지 않는다.
 */

// 1. 예외 직접 처리
class A {
	void a() {
		b();
	}
	void b() {
		try {
			Thread.sleep(1000);
			System.out.println("짠.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

// 2. throws 를 통한 처리
class B {
	void a() {
		try {
			b();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	void b() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("짜잔.");
	}
}

class C {
	void a() {
		try {
			b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	void b() throws InterruptedException {
		Thread.sleep(1000);
	}
}


public class Throws_Exception01 {
	public static void main(String[] args) {
		
	}
}
