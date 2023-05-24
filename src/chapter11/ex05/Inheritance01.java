package chapter11.ex05;

interface A {}
//interface B extends A {} //인터페이스가 인터페이스를 상속(extends) 가능
interface B {}

// 1. 단일 인터페이스 상속
class C implements A {}
class D implements B {}
// 2. 다중 인터페이스 상속
class E implements A,B{}

// 3. 클래스와 인터페이스 모두 상속 ( extends, implements 순서 )
class F extends C implements A,B{}

public class Inheritance01 {
	public static void main(String[] args) {
		/*
		 * Inheritance Interface
		 *   - 클래스는 하나의 부모 클래스만 가질 수 있다. <자바의 특징, 다중상속 불가능.>
		 *   - 인터페이스를 구현한 클래스는 여러 인터페이스를 상속 할 수 있다.
		 */
	}
}