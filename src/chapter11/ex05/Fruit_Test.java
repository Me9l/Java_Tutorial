package chapter11.ex05;

public class Fruit_Test {

	public static void main(String[] args) {
		Fruit f1 = new Apple();
		Fruit f2 = new Banana();
		Fruit f3 = new Strawberry();
		
		Fruit[] arr = new Fruit[] {f1,f2,f3};
		
		for (Fruit fruit : arr) {
			fruit.name();
			fruit.eat();
			fruit.color();
			System.out.println("------");
		}
	}

}
