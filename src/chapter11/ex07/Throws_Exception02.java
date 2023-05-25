package chapter11.ex07;

//throws

class AA {
	void a() throws InterruptedException {
		b();
	}
	void b() throws InterruptedException {
		c();
	}
	void c() throws InterruptedException {
		Thread.sleep(1000);
	}
}

public class Throws_Exception02 {

	public static void main(String[] args) {
		AA a1 = new AA();
		
		// main 메소드로 가기전에 try catch 로 예외 처리.
		try {
			a1.a();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
