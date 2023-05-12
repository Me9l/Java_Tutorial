package chapter05.ex06;

public class Main_method_Argument01 {
	public static void main(String[] args) {
		/*
		 * Method : 객체지향언어(OOP) , C 언어 : 함수
		   형식
		   접근지정자 반환타입 메소드명 ( 인풋 매개변수 ) {
		    	실행구문
				}
		 */
		
		// 1. args : main method로 String[] 타입을 담는 배열변수
		
		// main method의 input 으로 값을 넘겨서 변수에 할당하고 출력
		String a = args[0];
		String b = args[1];
		String c = args[2];
		String d = args[3];
		
		// Run Configurations ... 에서 Arguments 에 값 설정
		
		System.out.println( a + b + c + d ); // String type : ' + ' 가 연결연산자
		
		// String 을 정수로 변환 : Integer.PerseInt();
		
		int aa = Integer.parseInt(args[0]);
		int bb = Integer.parseInt(args[1]);
		int cc = Integer.parseInt(c);
		int dd = Integer.parseInt(d);
		
		System.out.println( aa + bb + cc + dd );
		
		//main method 의 매개변수 args로 들어오는 값 for loop 를 이용한 출력
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]+10);
		}
	}
}
