package chapter09.ex06;

class C {
	String name;
	C (String name) {
		this.name = name;
	}
}

class D {
	String name;
	D (String name) {
		this.name = name;		
	}
	
	// Object 클래스의 equals override ( D 객체의 name field 값이 같을 때 true return )
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((D)obj).name) {
			return true;
		}else {
			return false;
		}
	}
	
	
}

public class Object_Class03 {

	public static void main(String[] args) {
		C c1 = new C("박보검");
		C c2 = new C("박보검");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("===============");
		System.out.println(c1 == c2);	// stack에 저장된 값 비교.
		System.out.println(c1.equals(c2));	// stack 에 저장된 값 비교.
		System.out.println(c1.name == c2.name);	// stack 에 저장된 값 비교.
		System.out.println(c1.name.equals(c2.name));	// stack 에 저장된 값 비교.
		System.out.println("===============");
		
		D d1 = new D("이순신");
		D d2 = new D("이순신");
		
		System.out.println(d1 == d2);
		System.out.println(d1.equals(d2));	//재정의
		
	}
}
