package chapter12.ex04;

class A {
	
	public <T> void method1 ( T t ) {
		
//		t.length();
		System.out.println(t + " : " + t.toString().length());
		System.out.println(t + " : " + t.equals("coffee"));
	}
	
	public int method2 ( String str ) {
		return str.length();
	}
}

public class availableGenericMethod {

	public static void main(String[] args) {
		/*
		 * 사용 가능한 제네릭 메소드 : Object 클래스의 메소드만 사용 가능.
		 */
		
		A a = new A();
		System.out.println(a.method2("Hello World"));
		a.<String>method1("coffee");
		a.<Integer>method1(111);
		a.method1("i'm your father");
		
		System.out.println(a.method2("Hello"));
		
		
	}

}