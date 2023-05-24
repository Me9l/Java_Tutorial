package chapter11.ex04;

public class Animal_Test {

	public static void main(String[] args) {
		// 1. 각 클래스를 객체화 해서 Interface 형으로 지정.
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new Tiger();
		
		a1.cry();
		a2.cry();
		a3.cry();
		
		System.out.println("==========");
		
		Animal[] arr = new Animal[] {a1,a2,a3};
		for (Animal i : arr) {
			i.act();
		}
	}

}
