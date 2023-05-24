package chapter11.ex05;

public class Strawberry implements Fruit {
	@Override
	public void name() {
		System.out.println("딸기");
	}

	@Override
	public void eat() {
		System.out.println("가 좋아.");
	}

	@Override
	public void color() {
		System.out.println("빨간색.");
	}
}
