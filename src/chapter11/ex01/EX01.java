package chapter11.ex01;

abstract class Car {
	abstract void drive();
	abstract void oil();
}

class Truck extends Car {

	@Override
	void drive() {
		System.out.println("트럭 움직입니다.");
	}

	@Override
	void oil() {
		System.out.println("경유를 사용 합니다.");
	}
}

class OwnCar extends Car {

	@Override
	void drive() {
		System.out.println("자가용 움직입니다.");
	}

	@Override
	void oil() {
		System.out.println("휘발유를 사용 합니다.");
	}
}

class Excavator extends Car {

	@Override
	void drive() {
		System.out.println("포크레인 움직입니다.");
	}

	@Override
	void oil() {
		System.out.println("경유를 사용 합니다.");
	}

}

class Bongo extends Car {

	@Override
	void drive() {
		System.out.println("봉고 움직입니다.");
	}

	@Override
	void oil() {
		System.out.println("LPG를 사용 합니다.");
	}

}

public class EX01 {
	public static void main(String[] args) {
		Car truck = new Truck();
		Car ownCar = new OwnCar();
		Car excvt = new Excavator();
		Car bongo = new Bongo();
		
		Car[] arr = new Car[] {truck,ownCar,excvt,bongo};
		
		for (Car car : arr) {
			car.drive();
			car.oil();
			System.out.println("--------------");
		}
		
	}
}
