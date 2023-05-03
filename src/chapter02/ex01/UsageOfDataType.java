package chapter02.ex01;

public class UsageOfDataType {
	public static void main(String[] args) {
		// 변수선언 두가지 방법
		// 1. 변수 선언과 동시에 값 할당
		int a = 2 ;
		// 2. 변수 선언과 할당을 따로
		int b ;
		// 값을 할당하지 않은 상태에서 변수를 사용하면 오류 발생
		b = 3 ;
		System.out.println(a+","+b);
		
		// 상수선언 : 변수 이름 앞에 final 키 작성. 상수 이름은 전체 대문자로 사용
		final double PI = 3.14;
		System.out.println(PI);
	}
}
