package chapter07.ex02;

class G {
	// method
	// - instance method : 객체화를 통해 호출 가능.
	// - static method : 객체 생성 없이 클래스 호출을 통해 접근 가능.
	
	void sum(int a , int b) {
		System.out.println(a + b + " : 두 매개변수의 합");	// + : 덧셈으로 처리
		System.out.println("두 매개변수의 합 : " + a + b);	// + : 연결연산자로 처리
		System.out.println("두 매개변수의 합 : " + (a + b));// 괄호로 해결한 예
		}
	
	static int diff(int a, int b) {
		return a - b ;
	}
}

public class Method03 {
	public static void main(String[] args) {
		G g = new G();
		g.sum(1, 2);
		System.out.println("static int diff call : " + G.diff(2, 1));
	}
}
