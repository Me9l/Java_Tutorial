package chapter11.ex06;

public class Multi_Catch01 {
	public static void main(String[] args) {
		/*
		 * Multi Catch : 프로그램 내에서 여러 예외를 하나의 Try Catch를 사용해서 처리.
		 * 	1. 개별 처리
		 *  2. Try 에 여러 예외를 적용하고 각각의 catch 구문을 만들어서 처리.
		 *  3. Try 에 여러 예외를 적용하고, Exception 을 한번에 처리.
		 */
		
		// 1. 개별 처리

		try {
			System.out.println( 5/0 );		// ArithmeticException
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		try {
			int num = Integer.parseInt("10!");
			System.out.println(num);		// NumberFormatException
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("============");
		
		
		// 2. 여러 예외 개별 처리
		
		try {
			System.out.println( 5/0 );		// ArithmeticException
			int num = Integer.parseInt("10a");
			System.out.println(num);		// NumberFormatException
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		
		// 3. 여러 예외 일괄 처리
		
		try {
			System.out.println( 5/0 );		// ArithmeticException
			int num = Integer.parseInt("10a");
			System.out.println(num);		// NumberFormatException
			
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println(e);
		}
		
	}
}
