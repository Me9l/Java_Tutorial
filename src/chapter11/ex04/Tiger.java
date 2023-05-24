package chapter11.ex04;

public class Tiger implements Animal {

	@Override
	public void act() {
		System.out.println("호랑이 달린다.");
	}

	@Override
	public void cry() {
		System.out.println("roar");
	}

}
