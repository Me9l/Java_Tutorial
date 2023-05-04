package chapter02.ex05;

public class TypeCasting {

	public static void main(String[] args) {
		/*
		타입 캐스팅 ( Type Casting ) : 정수 => 실수 , 실수 => 정수
		- 낮은 자료형, 높은 자료형
		byte => short => int => long => float => double
		
		- 업캐스팅 ( up casting ) : 낮은 자료형에서 높은 자료형으로 변환. 자동으로 변환된다.
		- 다운캐스팅 (down casting ) : 높은 자료형에서 낮은 자료형으로 변환. 수동으로 명시하여 변환.
		*/
//		int v1 = 3.1 ; // type error
		int v1 = (int)3.7; // 명시적 다운 캐스팅. 소수이하는 버리고 정수만 반환.
		System.out.println(v1);
		double v2 = 3; // 업캐스팅. 자동적용. (double)3; 과 같음.(생략됨)
		System.out.println(v2);
		
		
		// 다운캐스팅 필요한 경우
//		int v3 = 5.8;
//		long v4 = 10.123456789;
		int v3 = (int)5.8;
		long v4 = (long)10.56789;
		System.out.println(v3);
		System.out.println(v4);
		
		// 자동 업캐스팅되어 오류 발생하지 않음
		float v5 = 5;
		double v6 = 6;
		
	}
}
