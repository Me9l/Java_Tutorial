package chapter11.ex07;

class Aaa {
	void a() throws ClassNotFoundException {
		b();
	}
	void b() throws ClassNotFoundException {
		c();
	}
	void c() throws ClassNotFoundException {
		Class<?> cls = Class.forName("java.lang.Object");
		System.out.println(cls);
	}
}

public class Throws_Exception03 {
	public static void main(String[] args){
		Aaa a1 = new Aaa();
		try {
			a1.a();
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();	// 오류 정보 출력
		}
	}
}
