package chapter09.ex01;

// 부모 클래스  ( Human )   <== 필드와 메소드 : 자식클래스에서 공통된 특징을 갇는 필드와 메소드를 정의 함. 
class Human {
	
	String name ;   //모든 사람은 이름을 갇는다. 
	int age ;       //모든 사람은 나이를 갇고 있다. 
	
	void eat() {   //모든 사람은 먹는다. 
		System.out.println("모든 사람은 먹는다. ");
	}
	
	void sleep() {  //모든 사람은 잠을 잔다. 
		System.out.println("모든 사람은 잠을 잔다. ");
	}
		
}

// 자식 클래스 ( Student (학생) , Worker (근로자), Professor(교수) )
	// 부모 클래스의 필드와 메소드를 상속 받게 됨. 
	// 추가적으로 그 클래스 만이 가지는 필드와 메소드를 정의 해서 사용. 

class Student extends Human{     // 
		
	// 추가적으로 학생 클래스에 필요한 필드와 메소드를 정의함. 
	int studentID;   //학생의 학번
	void goToSchool () {
		System.out.println("학생은 학교에 갑니다. ");
	}
	
}
class Worker extends Human {
	
	int workerID; 
	void goToWork() {
		System.out.println("근로자는 일터로 일하로 갑니다. ");
	}
	
}
class Professor extends Human{
	int professorID; 
	void goToTeach () {
		System.out.println("교수님은 가르치러 갑니다. ");
	}
}




public class Inheritance {

	public static void main(String[] args) {
		/* 상속 (Inheritance) : 부모 클래스 (객체화) 의 필드(속성) 와 메소드(기능), 이너클래스 를 자식 클래스에서 상속받아서 사용.
		    - 생성자는 상속 되지 않는다. 
			- 중복된 코드를 방지 할 수 있다. 코드가 간결해지고 생산성이 향상됨
			- 객체 지향언어의 꽃 이다 
			- 다형성 : 부모 클래스의 내용을 상속 받아서 다양한 형태로 출력  : 동물 (부모 클래스) <== 사람. 독수리, 사자, 호랑이, 개, 고양이 
			          -- 부모 클래스의 필드와 메소드는 자식 클래스 내려감.
			- 배열이나 컬렉션에 담아서 사용 ( 부모 클래스의 타입으로 업캐팅해서 저장 ) 
			     -- 배열이나 컬렉션에 담긴 내용을 다운 캐스팅해서 사용. 
			- 자바는 다중상속지 지원되지 않음. ( 자식 클래스는 하나의 부모 클래스만 가진다. ) 
			      
		*/ 
		
		Student s1 = new Student();   
		
		// 필드 
		s1.age = 10; 			// Human 클래스의 필드 
		s1.name = "홍길동"; 		// Human 클래스의 필드 
		s1.studentID = 1111 ;   // Student 클래스의 필드 
				
		// 메소드 
		s1.eat();				//Human 
		s1.sleep();				//Human
		s1.goToSchool();		//Student 
		
		
		Worker w1 = new Worker(); 
		// 필드 
		w1.name="김유신"; 
		w1.age = 20; 
		w1.workerID = 2222 ; 
		
		//메소드 호출 
		w1.eat();
		w1.sleep();
		w1.goToWork();
		
		Professor p1 = new Professor(); 
		//필드
		p1.name = "세종대왕"; 
		p1.age = 30 ; 
		p1.professorID = 3333; 
		
		//메소드 호출 
		p1.eat();
		p1.sleep();
		p1.goToTeach();   
		
		
		
	}

}