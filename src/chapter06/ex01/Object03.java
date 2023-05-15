package chapter06.ex01;

class Student {	// 외부 클래스, 같은 레벨에서 public class 는 하나만 사용 가능.
	
//	public Student() {} // default constructor

	// field
	String name ;
	int grade ;
	int kor ;
	int eng ;
	int math ;
	
	
	// method
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println("=============");
	}
	public void print(String name,int grade,int kor,int eng,int math) {
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println("=============");
	}
}

public class Object03 {

	public static void main(String[] args) {
		// s1 객체생성 : 홍길동, 3학년, 국어 : 80, 영어 : 90, 수학 : 100
		// s2 객체생성 : 이순신, 4학년, 국어 : 60, 영어 : 80, 수학 : 70
		// s3 객체생성 : 세종대왕, 5학년, 국어 : 90, 영어 : 60, 수학 : 90
		// s4 객체생성 : 율곡이이, 6학년, 국어 : 80, 영어 : 70, 수학 : 90
		
		Student s1 = new Student();
		s1.print();				//필드 초기값 출력
		s1.name = "홍길동";
		s1.grade = 3;
		s1.kor = 80;
		s1.eng = 90;
		s1.math = 100;
		s1.print();
		Student s2 = new Student();
		s2.name = "이순신";
		s2.grade = 4;
		s2.kor = 60;
		s2.eng = 80;
		s2.math = 70;
		s2.print();
		Student s3 = new Student();
		s3.name = "세종대왕";
		s3.grade = 5;
		s3.kor = 90;
		s3.eng = 60;
		s3.math = 90;
		s3.print();
		Student s4 = new Student();
		s4.name = "율곡이이";
		s4.grade = 6;
		s4.kor = 80;
		s4.eng = 70;
		s4.math = 90;
		s4.print();
		
		Student s5 = new Student();
		s5.print("밥보검", 6, 70, 80, 90);
	}

}
