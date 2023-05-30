package chapter12.ex06;

// 부모 클래스 ( Generic Type )
class Parent<T>{
	T t ;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}
// 자식 클래스 ( Generic Type ) : 부모클래스의 타입이 반드시 자식클래스에 명시되어야 한다.
class Child1<T> extends Parent<T> {
}
class Child2<T, K> extends Parent<T> {
	K k;
	public K getK() {
		return k;
	}
	public void setK(K k) {
		this.k = k;
	}
}

public class InheritanceGeneric {
	public static void main(String[] args) {
		/*
		 * 제네릭 클래스의 상속
		 *  - 자식 클래스는 부모 클래스의 타입수와 같거나 많아야 한다.
		 */
		
		// 부모 제네릭 클래스
		Parent<String> p1 = new Parent<>();	//객체 생성 및 타입 지정
		p1.setT("Parent > t");
		System.out.println(p1.getT());
		
		Parent<Double> p2 = new Parent<>();
		p2.setT(3.14);
		System.out.println(p2.getT());
		
		// 자식 제네릭 클래스 1
		Child1<String> c1 = new Child1<>();
		c1.setT("Child1 > t");			// 상속받은 setT();
		System.out.println(c1.getT());	// 상속받은 getT();
		
		// 자식 제네릭 클래스 2
		Child2<String,Double> c2 = new Child2<>();
		c2.setT("PI");
		c2.setK(3.141592);
		System.out.println(c2.getT());
		System.out.println(c2.getK());
		
	}
}
