package chapter03.ex03;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		논리 연산자 : 논리 연산한 결과를 true , false 로 반환
		
		&& ( AND )
		|| ( OR )
		^ ( XOR ) : 앞뒤가 같으면 false , 다르면 true
		! ( NOT )
		*/
		
//		AND 연산 : &&
		System.out.println("==== AND && ====");
		System.out.println(true && true);
		System.out.println(true && false);
		//앞의 값이 false 이면 무조건 false 이기 때문에 dead code.
		System.out.println(false && true);
		System.out.println(false && false);
		
//		OR 연산 : ||
		System.out.println("==== OR || ====");
		System.out.println(false || true);
		System.out.println(false || false);
		//앞의 값이 true 이면 무조건 true 이기 때문에 dead code.
		System.out.println(true || true);
		System.out.println(true || false);
		
//		XOR 연산 : ^ 
		System.out.println("==== XOR ^ ====");
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		
//		NOT 연산 : ! 
		System.out.println("==== NOT ! ====");
		System.out.println(!true);
		System.out.println(!false);
		System.out.println("===============");

		// short circuit 발생 할 수 있다. ( dead code )
		System.out.println(true && true); //발생하지않음
		System.out.println(false && true); //발생
		
		int v1 = 3;
		System.out.println(false && ++v1 > 6 );
		System.out.println(v1); // short circuit 발생으로 3이 출력.
		
		System.out.println(true && ++v1 > 6 );
		System.out.println(v1);
		
//		OR 연산에서 앞의 값이 true이면 short circuit 발생
		System.out.println(true || false); // short circuit 발생
		System.out.println(false || false);
		
//		short circuit 방지 : & , | 연산자 사용
		System.out.println(false & ++v1 > 6);
		System.out.println(v1);
		System.out.println(true | false);
	}

}