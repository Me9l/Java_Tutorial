package chapter09.ex02;
// Inheritance, Method Overriding (instance method), up casting, down casting, array

// 부모 클래스
class Human {	//(부모)사람 <==> (자식) 학생, 교수, 근로자

	// field - 상속 받을 자식 클래스의 공통 속성 정의.
	String name ;
	int age ;	
	
	// instance method
	void meal() {
		System.out.println("Human-meal()");
	}
}

// 자식 클래스
class Student extends Human {
//	Student(){
//		super();	//부모클래스의 생성자 호출 ( 생략 되어 있음 )
//	}
	
	// field - student에만 적용될 속성
	int stuId ;
	
	// method
	void stuDc() {
		System.out.println("학생할인 적용.");
	}
	
	// method overriding - 부모클래스에서 정의한 메소드를 자식 클래스가 재정의.
	@Override
	void meal() {
//		super.meal();					// 부모 클래스 메소드 명시적 호출
		System.out.println("급식.");
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", name=" + name + ", age=" + age + "]";
	}
	
	
}

class Professor extends Human {
	int professorId ;
	
	void proDc() {
		System.out.println("No. getaway");
	}
	@Override
	void meal() {
		System.out.println("학식.");
	}
	
	@Override
	public String toString() {
		return "Professor [professorId=" + professorId + ", name=" + name + ", age=" + age + "]";
	}
		
}

class Worker extends Human {
	int workerId ;
	
	void slaveDc() {
		System.out.println("최대 할인 적용.");
	}
	
	@Override
	void meal() {
		System.out.println("돼지불백.");
	}

	@Override
	public String toString() {
		return "Worker [workerId=" + workerId + ", name=" + name + ", age=" + age + "]";
	}
	
}

public class EX01 {
	public static void main(String[] args) {
		// 1. 부모클래스의 필드와 메소드 상속 확인
		
		// Human 클래스 객체 - h1 : Human type만 가짐
		Human h1 = new Human();		// Human 의 필드 , 메소드만 접근 가능
									// 자식 클래스를 내포하지 않음 ( down casting 불가능 )
		
//		Student ss1 = h1 ;					// 다운캐스팅 오류 (컴파일시 오류 발생)
//		Student ss1 = (Student)h1 ;			// 다운캐스팅할 클래스 명시
//		ss1.meal();							// 런타임 오류 발생 (실행시 오류 발생)
		System.out.println(h1 instanceof Human);	// true
		System.out.println(h1 instanceof Student);	// false
		System.out.println(h1 instanceof Worker);	// false
		
//		if ( h1 instanceof Student) {
//			Student ss1 = (Student)h1;
//		}else {
//			System.out.println("h1에 Student 타입 존재하지 않음.");
//		}
		
		System.out.println("----------------------");
		
		// student 클래스 객체
		Student s1 = new Student();	// Human / Student 내포, Student 타입으로 지정
									// Human, Student 필드 및 메소드 접근 가능
		s1.name = "학생1";				// Human 객체의 필드
		s1.age = 20;					// Human 객체의 필드
		s1.stuId = 23052201;			// Student 객체 필드
		
		// Human type 의 Student 객체
		Human s2 = new Student();	// Human / Student 내포, Human 타입으로 지정
									// Human 의 필드, 메소드만 접근 가능
		s2.name = "사람1";
		s2.age = 30;
		
									// s2는 Human <=> Student 타입캐스팅 가능
		System.out.println(s2 instanceof Student);
		
		Student ss2 = null;
		if (s2 instanceof Student) {
		ss2 = (Student)s2;			// 다운캐스팅
		}else {
			System.out.println("s2 has no instance of Student");
		}
		ss2.name = "학생2";
		ss2.age = 40;
		ss2.stuDc();
		
		// up casting : ss2는 human 을 내포하기 때문에 명시하지 않아도 자동 캐스팅 가능
//		Human hh1 = ss2 ;		// up casting 시 instanceof 안써도 상관없음
		
		// 자식을 객체화 해서 부모타입으로 지정 후 배열/컬렉션에 저장후 출력
		
		Student s10 = new Student();
		Professor p10 = new Professor();
		Worker w10 = new Worker();
		
		s10.name = "s01.name";
		s10.age = 20;
		s10.stuId = 100123;
		
		p10.name = "p01.name";
		p10.age = 60;
		p10.professorId = 200234;
		
		w10.name = "w01.name";
		w10.age = 50;
		w10.workerId = 300345;
		
		// 배열 / 컬렉션에 저장되는 객체는 동일한 타입으로 지정되어야 한다.
		Human[] arr = new Human[] {s10,p10,w10}; 	// human으로 자동 up casting
		
//		Human h20 = arr[0];
//		Human h21 = arr[1];
//		Human h22 = arr[2];
		
		Student s20 = (Student)arr[0];
		Professor s21 = (Professor)arr[1];
		Worker s22 = (Worker)arr[2];

		System.out.println(s20);
		System.out.println(s21);
		System.out.println(s22);
		
		// 3-1 Human 객체 생성 후 meal90 호출
		Human h30 = new Human();
		h30.meal();					// Human class method
		
		// 3-2 Student 객체 생성시 Student 타입으로 지정
		Student s30 = new Student();	// s30 은 Human / Student
		s30.meal();
		
		Professor p30 = new Professor();
		Worker w30 = new Worker();
		p30.meal();
		w30.meal();
		
		Human h40 = new Student();
		Human h41 = new Professor();
		Human h42 = new Worker();
		
		h40.meal();			// Human 클래스 meal() 호출시, Student 클래스의 오버라이딩된 meal()이 동작
		h41.meal();
		h42.meal();
							// 부모의 메소드 (eat()) 호출하면 자식 클래스의 오버라이딩 된 메소드가 출력 된다.
		
		
	}
}