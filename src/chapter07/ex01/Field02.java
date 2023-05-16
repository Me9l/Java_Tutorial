package chapter07.ex01;

class B {
	int m ;			// instance field
	static int n ;	// static(정적) field	// 모든 객체와 공유

}

public class Field02 {
	public static void main(String[] args) {
		// B 타입으로 b1,b2,b3 객체 생성
		B b1 = new B();
		B b2 = new B();
		B b3 = new B();

		// 각 객체의 instance field 에 값 할당
		b1.m = 1;
		b2.m = 2;
		b3.m = 3;
		System.out.printf("b1.m : %d , b2.m : %d , b3.m : %d\n",b1.m,b2.m,b3.m);
	
		// static field 에 값 할당
		b1.n = 10 ;
		System.out.printf("b1.n : %d , b2.n : %d , b3.n : %d\n",b1.n,b2.n,b3.n);

		//객체 생성 없이 클래스로 접근.
		B.n = 20 ;
		System.out.printf("B.n : %d\n",B.n);
		
	}
}
