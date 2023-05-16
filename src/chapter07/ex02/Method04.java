package chapter07.ex02;

public class Method04 {

	String sum1(int a, int b) {
		return String.valueOf(a + b);
	}

	static int sum2(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		sum2(10,20);	// 같은 class안에서 static method 는 객체화 없이 호출 가능.
		int a = sum2(1,2);
		System.out.println(a);
		
		Method04 m1 = new Method04();
		String s1 = m1.sum1(1, 2);
		String s2 = m1.sum1(4, 5);
//		int s3 = sum2(7, 7);
		
		System.out.println(s1);		// "3"
		System.out.println(s2);		// "3"
		System.out.println(s1+s2);	// "39"
		
		System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));	// 12
		
		// 같은 클래스 내부에서 메소드 호출 ( static method can call static method )
		// sum2 : static(정적 메소드)
		int m = Method04.sum2(10, 20);	// 1. 클래스 명으로 호출 : 객체 생성 없이 호출
		System.out.println(m);
		
		Method04 m2 = new Method04();	// 2. 객체 생성 후 출력
		int n = m2.sum2(20, 40);		// ( static way 로 접근 하라는 문구 )
		System.out.println(n);
		
		int k = sum2(30,50);
		System.out.println(k);
		
	}
}
