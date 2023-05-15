package chapter06.ex01;

class Car {
	// 기본생성자
	public Car() {}
	
	// 필드 (속성)
	String company, name, color ;
	int speed ;
	double weight ;
	
	//메소드
	public void go() {
		System.out.println(name + " 주행 시작.");
	}
	public void stop() {
		System.out.println(name + " 멈춤.");
	}
	public void print() {
		System.out.println("회 사 명 : " + company);
		System.out.println("차   종 : " + name);
		System.out.println("색   상 : " + color);
		System.out.println("최대속도 : " + speed);
		System.out.println("공차중량 : " + weight + "t");
		System.out.println("==============");
	}
	
}

public class Object04 {
	public static void main(String[] args) {
		// car1 객체 : 현대/그랜져/검정/250/1.2톤
		// car2 객체 : 기아/K7/흰색/250/1.0톤
		// car3 객체 : 벤츠/MayBach/검정/300/2.0톤
		Car car1 = new Car();
		car1.company = "현대";
		car1.name = "그랜져";
		car1.color = "검정";
		car1.speed = 250;
		car1.weight = 1.2;
		car1.print();
		car1.go();
		car1.stop();
		
		Car car2 = new Car();
		car2.company = "기아";
		car2.name = "K7";
		car2.color = "흰색";
		car2.speed = 250;
		car2.weight = 1.0;
		car2.print();
		
		Car car3 = new Car();
		car3.company = "벤츠";
		car3.name = "마이바흐";
		car3.color = "검정";
		car3.speed = 300;
		car3.weight = 2.0;
		car3.print();
		
		
		Car[] arr = new Car[3];
		arr[0] = car1 ;
		arr[1] = car1 ;
		arr[2] = car1 ;
	}
}