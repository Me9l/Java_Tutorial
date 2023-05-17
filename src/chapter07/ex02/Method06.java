package chapter07.ex02;

class MethodOverriding { // 부모 클래스의 메소드 재정의
	// 필드
	String company, model, color;
	int maxSpeed;
	double weight;

	// 생성자
	MethodOverriding() {
		// 이거슨 기본생성자
		// 다른 생성자가 없을 때는 생략 가능.
	}

	MethodOverriding(String a, String b, String c, int d, double e) {
		this.company = a;
		this.model = b;
		this.color = c;
		this.maxSpeed = d;
		this.weight = e;
	}
	// 객체 출력시 객체의 Heap주소 대신, RAM에 저장된 값을 출력.

	@Override
	public String toString() {

		return "회사명 : " + company + "\t 모델 : " + model + "\t 색상 : " + color + "\t 최대속도 : " + maxSpeed + "\t 공차중량 : "
				+ weight;
	}

}

public class Method06 {
	public static void main(String[] args) {
		/*
		 * Object class : 모든 자바클래스의 최상위 클래스. - 모든 클래스는 Object 클래스의 필드,메소드를 상속 받는다. - 자식
		 * 클래스는 Object 클래스의 필드, 메소드를 사용 할 수 있다. - toString() 메소드는 객체 자체를 출력할 때
		 * toString() 이 실행된다. - 자식 클래스에서 toString() 메소드를 재정의, 객체의 필드값을 출력할 때 주로 사용된다.
		 */

		// 기본 생성자 호출 후 override된 toString 출력.
		MethodOverriding m1 = new MethodOverriding();
		System.out.println(m1);
		System.out.println(m1.toString());

		// 사용자 정의 생성자 호출 후 출력
		MethodOverriding m2 = new MethodOverriding("genesis", "GV80", "black", 280, 1230.0);
		MethodOverriding m3 = new MethodOverriding("hyundai", "granduer", "black", 270, 1020.0);
		MethodOverriding m4 = new MethodOverriding("kia", "k8", "black", 260, 1180.0);

		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
}
