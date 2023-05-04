package chapter03.ex02;

public class BitewiseOperator {

	public static void main(String[] args) {

		/*
		 다양한 진법 표현 과 비트 연산자
		*/
		
//		다양한 진법 표현
//		다야한 진법 : 10진수, 16진수,8진수, 2진수;
		int data = 13 ;
		System.out.println(Integer.toBinaryString(data)); //2진수
		System.out.println(Integer.toHexString(data));  //16진수
		System.out.println(Integer.toOctalString(data));  //8진수 

		System.out.println(Integer.parseInt("1101",2)) ; //13
		System.out.println(Integer.parseInt("15",8)) ; //13
		System.out.println(Integer.parseInt("d",16)) ; //13
		
//		문자열로 된 숫자를 정수로 변환 해서 연산
		System.out.println(3 + "5");
		
		System.out.println(Integer.parseInt("3") + Integer.parseInt("5"));
		
		String a = "3.14";
		String b = "3.14";
		System.out.println(Double.parseDouble(a)+Double.parseDouble(b));
		
//		2. 비트 연산 : & (AND), | (OR), ^ (XOR), ~ (NOT)

//		and : 둘중 하나라도 거짓이면 거짓
//		0 & 0 = 0 , 0 & 1 = 0 , 1 & 0 = 0 , 1 & 1 = 1 
		System.out.println( 3 & 10 ); // 2

//		or : 둘중 하나라도 참이면 참
//		0 | 0 = 0 , 0 | 1 = 1 , 1 | 0 = 1 , 1 | 1 = 1 
		System.out.println( 3 | 10 ); // 11

//		XOR : 두값이 같으면 0 , 다르면 1
//		0 ^ 0 = 0 , 0 ^ 1 = 1 , 1 ^ 0 = 1 , 1 ^ 1 = 0
		System.out.println( 3 ^ 10 ); // 9
		
//		NOT : 반대
		System.out.println(~3);  // -4
		System.out.println(~10); // -11
		
	}

}
