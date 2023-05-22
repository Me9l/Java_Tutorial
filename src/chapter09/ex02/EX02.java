package chapter09.ex02;

class Animal {
	// 인스턴스 메소드
	// 인스턴스 메소드만 오버라이딩 됨. (인스턴스 메소드 오버라이딩)
	// 필드는 오버라이딩 되지 않는다. (인스턴스 필드, 정적 필드)
	// 정적 메소드도 오버라이딩 되지 않는다.
	String name ;
	void run() {
		System.out.println("Animal > run()");
	}	
	
}
class Tiger extends Animal {

	@Override
	void run() {
		System.out.println("Tiger > run()");
	}
	
}
class Cat extends Animal {
	@Override
	void run() {
		System.out.println("Cat > run()");
	}
}
class Kitty extends Cat {
	@Override
	void run() {
//		super.run();
		System.out.println("Kitty > run()");
	}
}

public class EX02 {
	public static void main(String[] args) {
			// 자식 클래스를 객체화 해서 부모타입으로 지정 후 메소드 호출시 오버라이드 된 메소드 출력.
		
//		Animal animal = new Animal();
//		animal.name = "tigger";
//		System.out.println(animal.name);
		Animal tiger = new Tiger();
		System.out.println(tiger.name);
		Animal cat = new Cat();
		Animal kitty = new Kitty();
		
		tiger.run();
		cat.run();
		kitty.run();
		System.out.println("======= for =======");
		Animal[] arr = new Animal[] {tiger,cat,kitty};
		for (int i = 0; i < arr.length; i++) {
			arr[i].run();
		}
		System.out.println("----- for each -----");
		
		for (Animal a : arr) {
			a.run();
		}
	}
}