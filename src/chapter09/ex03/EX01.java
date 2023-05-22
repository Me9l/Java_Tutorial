package chapter09.ex03;

// 상속
// up casting, down casting
class Human {
	String name;
	int age;
}

class Student extends Human {
	int kor, eng, math;
}

public class EX01 {
	// method : Student 객체를 매개변수로 받아서 배열에 저장.
	// input = Student 객체. (Human 으로 up casting)
	Human[] arr = null;
	
	void arrMethod(Human h1, Human h2, Human h3) {
		// input받은 h1,h2,h3 객체를 arr배열에 저장.
		arr = new Human[] { h1, h2, h3 };
		// method 호출. (과목별 합 출력)
		sumKor(arr);
		sumEng(arr);
		System.out.println("수학점수의 합 : " + sumMath(arr));
	}

	void sumKor(Human[] arr) { // 각 객체의 국어점수를 더해서 결과를 출력.
								// Student로 다운 캐스팅 후 국어점수 합 출력.
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Student) {
				Student s = (Student) arr[i]; // down casting
				sum += s.kor;
			}
		}
		System.out.println("국어점수의 합 : " + sum);
	}

	void sumEng(Human[] arr) { // 각 객체의 영어점수를 더해서 결과 출력.
								// Student로 다운 캐스팅 후 영어점수 합 출력.
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Student) {
				Student s = (Student) arr[i]; // down casting
				sum += s.eng;
			}
		}
		System.out.println("영어점수의 합 : " + sum);
	}

	int sumMath(Human[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Student) {
				sum += ((Student) arr[i]).math;
			}
		}
		return sum; // 배열에 들어온 수학점수의 합을 return.
	}

	public static void main(String[] args) {
		Student s1 = new Student(); // 이름 : 홍길동, 나이 : 30, 성적 : 60/70/80
		Student s2 = new Student(); // 이름 : 이순신, 나이 : 40, 성적 : 66/77/88
		Student s3 = new Student(); // 이름 : 안중근, 나이 : 50, 성적 : 77/88/99

		s1.name = "홍길동";
		s1.age = 30;
		s1.kor = 60;
		s1.eng = 70;
		s1.math = 80;

		s2.name = "이순신";
		s2.age = 40;
		s2.kor = 66;
		s2.eng = 77;
		s2.math = 88;

		s3.name = "안중근";
		s3.age = 50;
		s3.kor = 77;
		s3.eng = 88;
		s3.math = 99;
		
		// method
		EX01 e1 = new EX01();
		e1.arrMethod(s1, s2, s3); // 각 객체의 과목별 합 출력.
	}
}
