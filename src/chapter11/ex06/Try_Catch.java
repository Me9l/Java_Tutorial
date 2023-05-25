package chapter11.ex06;

public class Try_Catch {
	
	public static void main(String[] args) {
		/*
		 * 예외 처리 방법
		 * 	1. throws : 마지막 호출하는 곳에서 예외 처리
		 * 		throw : 예외를 강제로 발생
		 *  2. try ~ catch 문을 사용해서 직접 예외 처리
		 */
		System.out.println("----");
		try {
			System.out.println("try");
			System.out.println( 3/0 ); // ArithmeticException
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("finally");
		}
		System.out.println("====");
	}
}
