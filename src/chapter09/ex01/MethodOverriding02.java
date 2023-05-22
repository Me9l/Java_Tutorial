package chapter09.ex01;

class Animal1 {
	
	void cry() {
		System.out.println("동물의 울음. ");
	}
}

class Tiger1 extends Animal1 {
	@Override
	void cry() {
		System.out.println("호랑이");
	}	
}
class Egle1 extends Animal1{
	@Override
	void cry() {
		System.out.println("독수리");
	}
}
class Lion1 extends Animal1{
	@Override
	void cry() {
		System.out.println("사자");
	}
}


public class MethodOverriding02 {

	public static void main(String[] args) {

		// 1. Animal 을 Animal 타입으로 객체화 
		Animal1 a1 = new Animal1(); 
		a1.cry();           // Animal 클래스의 cry 를 호출됨 
		
		// 2. 자식을 객체화 하면서 부모 타입으로 선언 : 오버라이딩된 메소드가 출력됨. 
		Animal1 a2 = new Tiger1(); 
		a2.cry();                // a2.cry() <== Animal 의 메소드 호출 , 오버라이딩된 메소들 
		
		Animal1 a3 = new Egle1(); 
		a3.cry();
		
		Animal1 a4 = new Lion1(); 
		a4.cry();
	}

}