package chapter09.ex03;

class Car {
	String company;
	int year;
}

class Hyundai extends Car {
	String name;
	int maxSpeed ;
	int oil;
}
class BMW extends Car {
	
}

public class EX02 {

	Car[] arr = null ;
	void carInfo(Car c1, Car c2, Car c3, Car c4) {
		// 객체를 input 받아 arr 배열에 저장.
		// 최고속도의 평균 출력
		// 오일용량의 합 출력
		arr = new Car[] {c1,c2,c3,c4};
		avgMaxSpeed(arr);
		System.out.println("오일 총 합 : " + sumOil(arr));
		
	}
	void avgMaxSpeed (Car[] arr) {
		int sum = 0;
		for (int i = 0 ; i < arr.length; i++) {
			if ( arr[i] instanceof Hyundai) {
				Hyundai h = (Hyundai)arr[i];
				sum += h.maxSpeed;
			}
		}
		System.out.println("평균 속도 : " + sum/arr.length);
	}
	int sumOil (Car[] arr) {
		int sum = 0 ;
		for( int i = 0 ; i < arr.length ; i++ ) {
			if ( arr[i] instanceof Hyundai ) {
				Hyundai h = new Hyundai();
				h = (Hyundai)arr[i];
				sum += h.oil;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
										// 연식 / 차종 / 최고속도 / 오일용량
		Hyundai h1 = new Hyundai();		// 2000 / equus / 330 / 60
		Hyundai h2 = new Hyundai();		// 2010 / Genesis / 300 / 50
		Hyundai h3 = new Hyundai();		// 2020 / granduer / 250 / 55
		Hyundai h4 = new Hyundai();		// 2023 / avante / 200 / 40
		
		h1.company = "Hyundai";
		h1.year = 2000;
		h1.name = "Equus";
		h1.maxSpeed = 330;
		h1.oil = 60;
		
		h2.company = "Hyundai";
		h2.year = 2010;
		h2.name = "Genesis";
		h2.maxSpeed = 300;
		h2.oil = 50;
		
		h3.company = "Hyundai";
		h3.year = 2020;
		h3.name = "Granduer";
		h3.maxSpeed = 250;
		h3.oil = 55;
		
		h4.company = "Hyundai";
		h4.year = 2023;
		h4.name = "Avante";
		h4.maxSpeed = 200;
		h4.oil = 40;
		
		EX02 ex = new EX02();
		ex.carInfo(h1, h2, h3, h4);
		
	}
}