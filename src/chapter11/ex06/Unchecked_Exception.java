package chapter11.ex06;

class AAAA {
	int a;
	int b;
}
class BBBB extends AAAA {
	int c;
	int d;
}

class CCCC extends AAAA {
	int e;
	int f;
	int a;
}

public class Unchecked_Exception {
	public static void main(String[] args) {
		/*
		 * 실행 예외 : UncheckedException, Runtime Exception.
		 */
		
		// 1. ArithmeticException : 정수를 0으로 나누면 발생되는 예외.
//		System.out.println( 5/0 ); // 컴퓨터에서 0으로 나누면 무조건 오류 발생.
		
		// 2. ClassCastingException : 다운캐스팅시 객체 내부에 해당 타입이 존재하지 않을때 발생.
		
//		AAAA a1 = new BBBB();
//		AAAA a2 = new CCCC();
		
//		CCCC c1 = (CCCC)a1;
		
		// 3. ArrayIndexOutOfBoundException : 배열 인덱스 범위를 넘은 경우 발생.
		
//		int[] arr = new int[3];
//		System.out.println(arr[3]);	//배열 범위를 넘음
		
		// 4. NumberFormatException : 문자 타입의 정수나 실수 바꿀때 발생하는 오류
//		String a = "10s";
//		int num = Integer.parseInt(a);
		
		// 5. NullPointException : 참조 주소의 값이 Null인 메소드 호출할 떄 발생.
		String str = null;
		System.out.println(str.charAt(0));
		
	}
}
