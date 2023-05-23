package chapter09.ex04;

class AA {
	static int a = 11;
}

class BB extends AA {
	static int a = 22;
}
public class Overriding_Static_Field {
	public static void main(String[] args) {
		/* static(정적) field : 클래스 영역에 field 값 저장.
			- static 은 객체 생성 없이 클래스명으로 접근 가능.
		*/
		System.out.println(AA.a);		// 11
		System.out.println(BB.a);		// 22
		
		AA ba = new BB();
		BB ab = (BB)ba;
		System.out.println(ba.a);		// 11
		System.out.println(ab.a);		// 22
	}
}
