package chapter12.ex04;

class GenericMethod {
	public <T> T method1(T t) {
		return t;
	}
	
	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2);
	}
	
	public <K,V> void method3 (K k, V v) {
		System.out.println(k + " : " + v);
	}
	
	public <K,V> void method4 (K k) {
		System.out.println("파라미터가 없어 타입 유추가 불가능 하기 때문에 타입을 지정해서 호출해야함.");
	}
	
}

public class GenericMethod01 {
	public static void main(String[] args) {
		/*
		 * GenericMethod - generic class 내부에는 generic method 를 생성 할 수 없다. - 일반 클래스에
		 * generic method를 만들 수 있다.
		 *  - 1. 객체를 생성해서 메소드 호출시 <타입>지정 해서 호출.
		 *  - 2. input param의 타입이 유추 가능한 경우 생략 가능.
		 *  
		 */

//		Generic Method 호출
		GenericMethod gm = new GenericMethod();		// 일반 클래스 객체화

		String str1 = gm.<String>method1("Str");	// generic method : 메소드 호출시 타입을 지정해서 호출.
		String str2 = gm.method1("Hello");	// 

		System.out.println(str1);
		System.out.println(str2);

		Integer int1 = gm.<Integer>method1(10);
		Integer int2 = gm.method1(20);
		
		System.out.println(int1);
		System.out.println(int2);
		
		Boolean b1 = gm.<String>method2("True", "true");		
		boolean b2 = gm.<Integer>method2(12,12);
		boolean b3 = gm.method2(12,12);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		gm.<String,Integer> method3("국어",80);
		gm.method3("영어", 90);
		gm.method3(404, "page not found");
		
		gm.<String,String>method4("");
		
	}
}