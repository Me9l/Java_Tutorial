package chapter12.ex02;

class HyunDai {
	String name = "현대";
}
class Tesla {
	String name = "테슬라";
}
class Benz {
	String name = "벤츠";
}

class Car<T> {
	private T car;

	public T getCar() {
		return car;
	}

	public void setCar(T car) {
		this.car = car;
	}
	
}

public class EX02 {
	public static void main(String[] args) {
		// Car Generic 클래스에 HyunDai, Tesla, Benz 클래스를 setter 주입.
		// getter를 사용해 필드 내용 출력.
		
		Car<HyunDai> hyundai = new Car<HyunDai>();
		hyundai.setCar(new HyunDai());
		System.out.println(hyundai.getCar().name);
		
		Car<Tesla> tesla = new Car<>();
		tesla.setCar(new Tesla());
		System.out.println(tesla.getCar().name);
		
		Car<Benz> benz = new Car<>();
		benz.setCar(new Benz());
		System.out.println(benz.getCar().name);
	}
}
