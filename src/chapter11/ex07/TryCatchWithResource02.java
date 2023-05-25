package chapter11.ex07;

import java.io.InputStreamReader;

public class TryCatchWithResource02 {
	public static void main(String[] args) {
		/*
		 * try catch with Resource
		 * - 일반적인 try catch 구문
		 *  try {예외 발생가능 코드}
		 *  catch (예외 e) { 예외 처리 }
		 *	finally { 최종실행구문 및 객체 제거 }
		 *
		 * - try ( 리소스 선언 ) { 실행부 }
		 * 	 catch ( 예외 e) { 예외 처리 } // 객체 자동 close
		 */
		System.out.print("한글자 입력 >>> ");
		try (InputStreamReader isr = new InputStreamReader(System.in)) {
			char input = (char) isr.read();
			System.out.println(input);
		} catch (Exception e) {
			System.out.println(e);
		}	// finally에서 객체를 제거하지 않아도 자동으로 객체가 제거된다. ( isr.close(); )
		
		
//		try {
//			InputStreamReader isr = new InputStreamReader(System.in);
//			char inp = (char) isr.read();
//			System.out.println(inp);
//		} catch (Exception e) {
//			System.out.println(e);
//		} finally {
//		}
		
	}
}
