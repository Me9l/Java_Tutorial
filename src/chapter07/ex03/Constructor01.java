package chapter07.ex03;

class Student {
	// 생성자
	public Student() {}
	
	// 생성자 오버로딩 : 동일한 생성자명, args의 수,타입이 다름
	// this : 자기자신의 객체
	// 매개변수로 들어오는 변수명, 필드명, 받는 변수명 등 이름이 동일한 경우등
	// this를 이용해 자신의 객체의 필드명을 명확히 한다.
	Student(String sName){
		this.sName = sName;
	}
		
	Student(String sAddr, String sEmail) {
		this.sAddr = sAddr;
		this.sEmail = sEmail;
	}
	
	public Student(String sName, String sAddr, int sAge) {
		this.sName = sName;
		this.sAddr = sAddr;
		this.sAge = sAge;
	}

	Student(String sName, String sAddr, String sEmail, double sRecord) {
		this.sName = sName;
		this.sAddr = sAddr;
		this.sEmail = sEmail;
		this.sRecord = sRecord;
	}

	Student(String sName, String sAddr, String sEmail, int sAge, double sRecord) {
		this.sName = sName;
		this.sAddr = sAddr;
		this.sEmail = sEmail;
		this.sAge = sAge;
		this.sRecord = sRecord;
	}
	
	// 필드 (속성)
	String sName, sAddr, sEmail ;
	int sAge;
	double sRecord;
	
	
	// 메소드 (기능)
	
	// 객체의 필드 값 출력 : Object 클래스의 toString() 재정의
	@Override
	public String toString() {
		return "Student [sName=" + sName
				+ ", sAddr=" + sAddr
				+ ", sEmail=" + sEmail
				+ ", sAge=" + sAge
				+ ", sRecord=" + sRecord
				+ "]";
	}
}

public class Constructor01 {
	public static void main(String[] args) {
		/*
		생성자 (constructor)
			- 객체 생성시 필드의 초기값을 설정.
			- 리턴이 존재하지 않고 객체 이름과 동일한 이름을 가진다.
			- 기본 생성자는 생략되어있다.
			- 사용자 정의 생성자 생성 가능.
			- 사용자 정의 생성자를 생성하면 기본 생성자도 명시해 주어야한다.
		 */
		
		// 기본 생성자로 객체 생성
		Student s1 = new Student();
		System.out.println(s1);
		
		// 사용자 정의 생성자로 객체 생성
		Student s2 = new Student("팀쿡");
		Student s3 = new Student("califonia", "apple@gmail.com");
		Student s4 = new Student("일론머스크", "서산", 38);
		Student s5 = new Student("빌게이츠", "용인", "ms@micro.soft", 66.25);
		Student s6 = new Student("이재용", "삼성동", "jaeDragon@ss.com", 47, 88.75);
		
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
	}
}
