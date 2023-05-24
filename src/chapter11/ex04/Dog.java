package chapter11.ex04;

public class Dog implements Animal {

	@Override
	public void act() {
		System.out.println("개 달린다.");
	}

	@Override
	public void cry() {
		System.out.println("bowwow");
	}
	
}
