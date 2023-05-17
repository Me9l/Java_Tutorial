package chapter07.ex02;

class MethodOverLoading {
	void print() {
		System.out.println("input : none.");
	}
	
	void print(int a) {
		System.out.println("int : " + a);
	}

	void print(int a, int b) {
		System.out.println("int a : " + a + ", int b : " + b);
	}
	
	void print(double a) {
		System.out.println("double : " + a);
	}
	
	void print(double a, double b) {
		System.out.println("double a : " + a + ", double b : " + b);
	}
	
	void print(String a) {
		System.out.println("String : " + a);
	}
	void print(String a, String b) {
		System.out.println("String a : " + a + ", String b : " + b);
	}
	
	@Override
	public String toString() {
		
		return "재정의된 Object 클래스의 toString() (Override)";
	}
}

public class Method05 {
	public static void main(String[] args) {
		/*
		method overloading : 동일한 이름의 method, 시그니처에 따라 다른 메소드를 식별.
			- 시그니처 : 식별자. input args의 수, input args의 자료형에 따라 구별.
			- overload 시 intput param의 수, 자료형이 동일한 method를 만들면 에러발생.
				- print(int a, int b) <= error , print(int a , double b) <== ok.
				
		method overriding : 상속관계에 관련. 부모 클래스의 method를 자식클래스에서 재정의.
			- JAVA의 모든 클래스는 Object 클래스를 상속 받는다.
			- Object 클래스의 필드,메소드 사용 가능.
		*/
		
		//////// overloading ////////
		MethodOverLoading mol = new MethodOverLoading();
		
		// param 없는 print() 호출
		mol.print();
		mol.print(1);
		mol.print(1,2);
		mol.print(3.14);
		mol.print(3.14,0.1592);
		mol.print("cheese");
		mol.print("cheese", "pizza");
		
		/// call Object class method ///
		
		System.out.println(mol);			// 객체 출력
		System.out.println(mol.toString());	// object class method

	}
}
