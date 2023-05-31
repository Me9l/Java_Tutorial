package chapter13.ex02;

public class Car {
	String co;
	String name;
	String color;
	int maxSpeed;
	
	public Car(String co, String name, String color, int maxSpeed) {
//		super();	// Object class, default constructor
		this.co = co;
		this.name = name;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [co=" + co + ", name=" + name + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}
	
}
