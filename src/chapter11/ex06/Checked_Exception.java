package chapter11.ex06;

//import java.io.FileInputStream;
//import java.io.InputStreamReader;

public class Checked_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Error & Exception
		 * 
		 * - Error : H/W(CPU,RAM), OS(S/W, JVM
		 * - Exception : JVM에서 자바 프로그램상에서 발생하는 문제들
		 * 		- 개발자가 제어 가능
		 * 		- Exception 이 발생하면 프로그램이 종료됨.
		 * 		- Exception 이 발생해도 프로그램이 종료되지 않도록 처리해야함.
		 * 			- throws : 예외처리를 호출하는 쪽에서 처리하도록 미룸.
		 * 				- throw : 예외 강제 발생
		 * 			- try ~ catch : 직접 예외 처리.
		 * 
		 * 		- 일반예외 ( Checked Exception ) : 컴파일러가 체크하고 이클립스에서 알려줌.
		 * 		- 실행예외 ( Runtime Exception ) : 컴파일러가 체크하지 않음. 실행시 예외 발생.
		 * 
		 */
		
		// 1. Interrupted Exception ( 인터럽트 발생 )
//		Thread.sleep(1000);
		
		// 2. ClassNotFoundException ( 특정 경로에 해당 클래스가 존재하지 않을 경우 발생 )
//		Class cls = Class.forName("java.lang.Object");	// DB의 Driver 클래스 로드
		
		// 3. IOException : Input, Output 예외
//		InputStreamReader in = new InputStreamReader(System.in);
//		in.read();
		
		// 4. FileNotFoundException : 파일을 찾을수 없을 때 발생
//		FileInputStream fis = new FileInputStream("text.txt");
	}
}
