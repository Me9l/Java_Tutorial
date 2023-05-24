package chapter11.ex05;

public class Apple implements Fruit {

	@Override
	public void name() {
		System.out.println("사과");
	}

	@Override
	public void eat() {
		System.out.println("먹는다.");
	}

	@Override
	public void color() {
		System.out.println("빨간색.");
	}

}
