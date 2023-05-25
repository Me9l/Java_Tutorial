package chapter11.ex06;

public class Multi_Catch02 {
	public static void main(String[] args) {
		/*
		 * 예외 한번에 처리
		 * Exception : 모든 Exception 의 부모 클래스.
		 */
		
		try {
			System.out.println( 5/0 );
			int num = Integer.parseInt("1A");
			System.out.println(num);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		try {
			System.out.println( 5/0 );
			int num = Integer.parseInt("1A");
			System.out.println(num);
		}catch (ArithmeticException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e);		
		}
		
	}
}
