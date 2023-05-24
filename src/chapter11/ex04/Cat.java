package chapter11.ex04;

public class Cat implements Animal {

	@Override
	public void act() {
		System.out.println("캣 달린다.");
	}

	@Override
	public void cry() {
		System.out.println("Meow");
	}

}
